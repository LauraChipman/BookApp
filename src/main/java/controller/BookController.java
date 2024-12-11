package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.validation.Valid;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String listBooks(
            @RequestParam(required = false) String genre,
            @RequestParam(required = false) String author,
            Model model) {
        model.addAttribute("books", bookService.filterBooks(genre, author));
        return "book_list";
    }

    @GetMapping("/books/new")
    public String showForm(Model model) {
        model.addAttribute("book", new Book());
        return "book_form";
    }

    @PostMapping("/books")
    public String saveBook(@Valid @ModelAttribute Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "book_form";
        }
        bookService.saveBook(book);
        return "redirect:/books";
    }
    @RestController
    public class VisitCounterController {

        @Autowired
        private VisitorCounterService visitCounterService;

        // Endpoint to increment the counter (called when the page loads)
        @GetMapping("/api/page-visit")
        public int incrementPageVisit() {
            return visitCounterService.incrementAndGet();
        }

        // Endpoint to get the current count (polled every 3 seconds)
        @GetMapping("/api/page-hits")
        public int getPageHits() {
            return visitCounterService.getCount();
        }
    }
}