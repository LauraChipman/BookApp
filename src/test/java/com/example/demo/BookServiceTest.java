package com.example.demo;

import controller.Book;
import controller.BookRepository;
import controller.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    public BookServiceTest() {
        MockitoAnnotations.openMocks(this); // Initializes mocks
    }

    @Test
    public void testGetAllBooks() {
        // Arrange
        Book book1 = new Book("Book Title 1", "Author 1", "Genre 1");
        Book book2 = new Book("Book Title 2", "Author 2", "Genre 2");
        List<Book> mockBooks = Arrays.asList(book1, book2);

        // Mock behavior
        when(bookRepository.findAll()).thenReturn(mockBooks);

        // Act
        List<Book> result = bookService.getAllBooks();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Book Title 1", result.get(0).getTitle());
    }
}
