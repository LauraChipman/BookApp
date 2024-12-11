package com.example.demo;

import controller.BookService;
import controller.BookController;
import controller.Book;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookControllerTest {

    @Mock
    private BookService bookService;

    @Mock
    private Model model;

    @InjectMocks
    private BookController bookController;

    public BookControllerTest() {
        MockitoAnnotations.openMocks(this); // Initializes mocks
    }

    @Test
    public void testListBooks() {
        // Arrange
        List<Book> books = new ArrayList<>();
        books.add(new Book("Test Title", "Test Author", "Test Genre"));
        when(bookService.getAllBooks()).thenReturn(books);

        // Act
        String viewName = bookController.listBooks(null, null, model);

        // Assert
        verify(model, times(1)).addAttribute(eq("books"), any());
        assertEquals("book_list", viewName);
    }
}