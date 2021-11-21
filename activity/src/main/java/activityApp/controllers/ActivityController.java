package activityApp.controllers;


import activityApp.dao.ActivityDao;
import activityApp.domain.Activity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/activities")
public class ActivityController {

    private final ActivityDao activityDao;

    @GetMapping()
    public String getStatsByTrip(@RequestParam(value = "trip_id") long trip_id, Model model) {
        model.addAttribute("activityList", activityDao.getActivitiesByTripId(trip_id));
        final List<Activity> activitiesByTripId = activityDao.getActivitiesByTripId(trip_id);
        System.out.println(" РАСПЕЧАТАН "+ activitiesByTripId.size());
        return "activities/getStatByTrip";
    }

}

