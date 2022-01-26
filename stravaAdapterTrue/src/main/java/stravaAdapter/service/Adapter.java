package stravaAdapter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.model.SummaryActivity;
import stravaAdapter.model.ActivityDto;

import java.util.ArrayList;
import java.util.List;

@Component
public class Adapter {
    @Autowired
    private ActivitiesApi activitiesApi;

    public List<ActivityDto> getActivities(Integer before, Integer after, Integer page, Integer perPage) {
        final List<SummaryActivity> loggedInAthleteActivities = activitiesApi.getLoggedInAthleteActivities(before, after, page, perPage);
        System.out.println("All activities from ___ to ___" + loggedInAthleteActivities.size());
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

