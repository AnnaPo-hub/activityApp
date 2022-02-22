package activityApp.controllers;


import activityApp.dao.ActivityDao;
import activityApp.domain.Trip;
import activityApp.service.ActivityService;
import activityApp.service.TripService;
import activityApp.utils.Utils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("/activities")
public class ActivityController {

    private final ActivityDao activityDao;
    private final ActivityService activityService;
    private final TripService tripService;

    @GetMapping()
    public String getStatsByTrip(@RequestParam(value = "tripId") long tripId, Model model) {
        model.addAttribute("activityList", activityDao.countDistanceByType(tripId));
        return "activities/getStatByTrip";
    }

    @GetMapping("/getAllActivities")
    public String getTripActivityInfo(@RequestParam(value = "tripId") long tripId, Model model) {
        final Trip tripById = tripService.getTripById(tripId);
        final long tripStartDate = Utils.getTripStartDate(tripById);
        final long tripFinishDate = Utils.getTripFinishDate(tripById);
        model.addAttribute("activityList", activityService.getActivitiesByPeriod(tripFinishDate,tripStartDate, tripId));
        return "activities/showAll";
    }
}

