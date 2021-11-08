package stravaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.model.SummaryActivity;

import java.util.List;

@Component
public class Adapter {
    @Autowired
    private  ActivitiesApi activitiesApi;

    public void getActivities(Integer before, Integer after, Integer page, Integer perPage) {
        final List<SummaryActivity> loggedInAthleteActivities = activitiesApi.getLoggedInAthleteActivities(before, after, page, perPage);
        System.out.println("All activities from ___ to ___"+ loggedInAthleteActivities.size());
    }
}

