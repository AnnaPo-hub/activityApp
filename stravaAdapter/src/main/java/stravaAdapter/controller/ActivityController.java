//package stravaAdapter.controller;
//
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import ru.otus.activity.client.api.ActivitiesApi;
//import ru.otus.activity.client.model.SummaryActivity;
//
//import java.util.List;
//
//
//@AllArgsConstructor
//@RequestMapping("/trips/activities/{after}/{before)")
//public class ActivityController {
//    @Autowired
//    private ActivitiesApi activitiesApi;
//
//    public void  getActivities(Integer before, Integer after, Integer page, Integer perPage) {
//        final List<SummaryActivity> loggedInAthleteActivities = activitiesApi.getLoggedInAthleteActivities(before, after, page, perPage);
//        System.out.println("All activities from ___ to ___" + loggedInAthleteActivities.size());
//        loggedInAthleteActivities.forEach(a -> System.out.println(a.getName()));
//    }
//
//
//}
