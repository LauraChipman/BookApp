package controller;

import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> filterBooks(String genre, String author) {
        if (genre != null && author != null) {
            System.out.println("Querying findByGenreAndAuthor");
            return bookRepository.findByGenreAndAuthor(genre, author);
        } else if (genre != null) {
            System.out.println("Querying findByGenre");
            return bookRepository.findByGenre(genre);
        } else if (author != null) {
            System.out.println("Querying findByAuthor");
            return bookRepository.findByAuthor(author);
        }
        System.out.println("Returning all books");
        return bookRepository.findAll();
    }

}