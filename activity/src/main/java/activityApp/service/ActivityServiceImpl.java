package activityApp.service;

import activityApp.dao.ActivityDao;
import activityApp.domain.Activity;
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

    @Override
    public List<Activity> getActivitiesByPeriod(@RequestParam long before, @RequestParam long after) {
        RestTemplate restTemplate = new RestTemplate();
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
                final Activity saved = activityDao.save(act);
                saved.setTrip(tripService.getTripById(tripId));
            }
        }
        return activityList;
    }
}


