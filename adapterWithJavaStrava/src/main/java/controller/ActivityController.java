package controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/trips/activities/{after}/{before}")
public class ActivityController {
  //  private final TripDao tripDao;


//    @GetMapping()
//    public String getAthleteActivities(@PathVariable Integer after, @PathVariable Integer before ) {
//        Strava strava = new Strava(token);
//        final StravaAthlete athlete = strava.getAthlete(48834033);
//        Token token = new Token()
//
//        API api = new API("50c48de7cf58adb03f9a0d8e8a7e7f3a4163f879");
//        api.listAuthenticatedAthleteActivities()
//    }

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

