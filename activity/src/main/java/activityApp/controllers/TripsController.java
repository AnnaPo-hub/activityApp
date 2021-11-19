package activityApp.controllers;


import activityApp.dao.TripDao;
import activityApp.domain.Activity;
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
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
@RequestMapping("/trips")
public class TripsController {
    private final TripDao tripDao;
    private final TripService tripService;
    private final ActivityService activityService;

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("trips", tripDao.findAll());

        return "trips/showAll";
    }

    @GetMapping("/getStatistics")
    @ResponseBody
    public Map<String, Integer> getById(@RequestParam("id") Long id, Model model) {
        final Trip trip = tripService.getTripById(id);
        final long tripStartDate = Utils.getTripStartDate(trip);
        final long tripFinishDate = Utils.getTripFinishDate(trip);
        final List<Activity> activitiesByTripId = activityService.getActivitiesByTripId(tripFinishDate, tripStartDate);
        model.addAttribute("activityByTripId", tripService.getTripStatistics(activitiesByTripId));
        final Map<String, Integer> tripStatistics = tripService.getTripStatistics(activitiesByTripId);
        return tripStatistics;

        //return "trips/getStatByTrip";
    }
//
//    @GetMapping("/getByName")
//    public String getByName(@RequestParam("name") String bookName, Model model) {
//        model.addAttribute("booksByName", bookService.findBookByName(bookName));
//        return "books/getByName";
//    }
//
//    @GetMapping("/getByGenre")
//    public String getByGenre(@RequestParam("genre") String genre, Model model) {
//        model.addAttribute("booksByGenre", bookService.findBookByGenre(genre));
//        return "books/getByGenre";
//    }
//
//    @GetMapping("/getByAuthor")
//    public String getByAuthor(@RequestParam("author") String author, Model model) {
//        model.addAttribute("booksByAuthor", bookService.findBookByAuthor(author));
//        return "books/getByAuthor";
//    }


//    @GetMapping("/newBook")
//    public String newBook(Model model) {
//        model.addAttribute("book", new Book());
//        model.addAttribute("authors", authorDao.findAll());
//        model.addAttribute("genres", genreDao.findAll());
//        return "books/new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("book") Book book) {
//        bookService.createBook(book);
//        return "books/success";
//    }
//
//    @ResponseBody
//    @DeleteMapping("/delete")
//    public void delete(@RequestParam(name = "id") long id) {
//        bookService.deleteBookById(id);
//    }
}

