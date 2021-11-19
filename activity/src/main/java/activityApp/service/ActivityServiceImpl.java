package activityApp.service;

import activityApp.domain.Activity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityServiceImpl implements ActivityService {


    @Override
    //TODO исправить использование переменных urlPathVariables
    public List<Activity> getActivitiesByTripId(long before, long after) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Integer> urlPathVariables = new HashMap<>();
        urlPathVariables.put("before", (int) before);
        urlPathVariables.put("after", (int) after);
        List<Activity> activityList = new ArrayList<>();

        ResponseEntity<List<Activity>> responseEntity = restTemplate.exchange(
                "http://localhost:8080/activities/getAllActivities?after=1635529296&before=1636130496",
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Activity>>() {
                });
        if (responseEntity.hasBody()) {
            activityList = responseEntity.getBody();
        }
        return activityList;
    }
}


