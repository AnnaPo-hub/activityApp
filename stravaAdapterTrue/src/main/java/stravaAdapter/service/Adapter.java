package stravaAdapter.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.model.SummaryActivity;
import stravaAdapter.model.ActivityDto;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Component
public class Adapter {
    @Autowired
    private ActivitiesApi activitiesApi;

    public List<ActivityDto> getActivities(Integer before, Integer after, Integer page, Integer perPage) {
        log.info("Strava adapter started");
        final List<SummaryActivity> loggedInAthleteActivities = activitiesApi.getLoggedInAthleteActivities(before, after, page, perPage);
        List<ActivityDto> activities = new ArrayList<>();
        for (SummaryActivity activity : loggedInAthleteActivities) {
            final ActivityDto activitydto = ActivityDto.builder()
                    .id(activity.getId())
                    .name(activity.getName())
                    .distance(activity.getDistance())
                    .type(activity.getType().toString())
                    .build();
            activities.add(activitydto);
        }
        return activities;
    }
}

