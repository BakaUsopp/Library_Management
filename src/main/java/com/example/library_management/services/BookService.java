package com.example.library_management.services;

import com.example.library_management.entities.Book;
import com.example.library_management.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById((long) id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById((long) id);
    }

    public Book createBook(Book book) {

        return bookRepository.save(book);
    }

    public Book updateBook(int id, Book book) {

        return bookRepository.save(book);
    }
}