package activityApp.service;

import activityApp.dao.ActivityDao;
import activityApp.domain.Activity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Component
@AllArgsConstructor
public class ActivityServiceImpl implements ActivityService {

    private final ActivityDao activityDao;
    private final TripService tripService;
    //дергает страву и  сохраняет лист активностей в БД

    @HystrixCommand(commandProperties= {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="10000")
    })
    @Override
    public List<Activity> getActivitiesByPeriod(@RequestParam long before, @RequestParam long after, long tripId) {
        RestTemplate restTemplate = new RestTemplate();
        sleepRandomly();
        Map<String, Long> urlPathVariables = new HashMap<>();
        urlPathVariables.put("after", after);
        urlPathVariables.put("before", before);
        List<Activity> activityList = new ArrayList<>();

        ResponseEntity<Activity[]> responseEntity = restTemplate.getForEntity(
                "http://localhost:7001/activities/getAllActivities?after={after}&before={before}",
                Activity[].class,
                urlPathVariables);
        if (responseEntity.hasBody()) {
            activityList = Arrays.asList(responseEntity.getBody());
        }
        if (activityList != null) {
            for (Activity act : activityList) {
                act.setTrip(tripService.getTripById(tripId));
                activityDao.save(act);
            }
        }
        return activityList;
    }

    private void sleepRandomly() {
        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;
        if(randomNum == 3) {
            System.out.println("It is a chance for demonstrating Hystrix action");
            try {
                System.out.println("Start sleeping...." + System.currentTimeMillis());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Hystrix thread interupted...." + System.currentTimeMillis());
                e.printStackTrace();
            }
        }
    }
}


