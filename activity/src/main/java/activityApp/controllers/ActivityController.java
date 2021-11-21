package activityApp.controllers;


import activityApp.dao.ActivityDao;
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

    @GetMapping()
    public String getStatsByTrip(@RequestParam(value = "tripId") long tripId, Model model) {
        model.addAttribute("activityList", activityDao.countDistanceByTypeOfActivity(tripId));
        return "activities/getStatByTrip";
    }

}

