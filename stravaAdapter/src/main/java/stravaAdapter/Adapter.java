package stravaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.model.SummaryActivity;

import java.util.List;

public class Adapter {
    @Autowired
    private static ActivitiesApi activitiesApi;

    // потестировать и сделать константы page, perPage?
    //TODO подумать как это смаппить на сущность
    public static void getActivities(Integer before, Integer after, Integer page, Integer perPage) {
        final List<SummaryActivity> loggedInAthleteActivities = activitiesApi.getLoggedInAthleteActivities(before, after, page, perPage);
        System.out.println("ВСЕГО АКТИВНОСТЕЙ"+ loggedInAthleteActivities.size());
    }
}

