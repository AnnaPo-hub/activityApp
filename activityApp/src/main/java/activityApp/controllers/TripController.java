package activityApp.controllers;


import activityApp.service.TripService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/trips")
public class TripController {
    private final TripService tripService;

//    @GetMapping("/getById")
//    public String getById(@RequestParam("id") Long id, Model model) {
//        model.addAttribute("booksById", bookService.findBookById(id));
//        return "books/getById";
//    }
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

    @GetMapping()
    public String showAll(Model model) {
        model.addAttribute("trips", tripService.getAll());
        return "trips/showAll";
    }

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

