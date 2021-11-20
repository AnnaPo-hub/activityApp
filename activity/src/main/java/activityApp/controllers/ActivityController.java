package activityApp.controllers;


import activityApp.dao.ActivityDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityDao activityDao;

    @GetMapping()
    public String showAll( Model model) {
        model.addAttribute("activityList", activityDao.findAll());
        return "activities/showAll";
    }

}

