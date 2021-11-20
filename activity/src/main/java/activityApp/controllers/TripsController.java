package activityApp.controllers;


import activityApp.dao.TripDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/trips")
public class TripsController {
    private final TripDao tripDao;


    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("trips", tripDao.findAll());

        return "trips/showAll";
    }

//    @GetMapping("/getStats")
//    //@ResponseBody
//    public String getById(@RequestParam("id") Long id, Model model) {
//        final Trip trip = tripService.getTripById(id);
//        final long tripStartDate = Utils.getTripStartDate(trip);
//        final long tripFinishDate = Utils.getTripFinishDate(trip);
//       // final List<Activity> activitiesByTripId = activityService.getActivitiesByTripId(tripFinishDate, tripStartDate);
//        model.addAttribute("activityList", activityService.getActivitiesByTripId(tripFinishDate, tripStartDate));
//       // model.addAttribute("activityByTripId", tripService.getTripStatistics(activitiesByTripId));
////        final Map<String, Integer> tripStatistics = tripService.getTripStatistics(activitiesByTripId);
////        return tripStatistics;
//
//        return "trips/getStatByTrip";
//    }

}

