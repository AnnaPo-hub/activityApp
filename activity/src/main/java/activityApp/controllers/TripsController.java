package activityApp.controllers;


import activityApp.dao.TripDao;
import activityApp.domain.Trip;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/newTrip")
    public String newTrip(Model model) {
        model.addAttribute("trip", new Trip());
        return "trips/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("trip") Trip trip) {
        tripDao.save(trip);
        return "trips/success";
    }
}

