package com.example.library_management.services;

import com.example.library_management.entities.Author;
import com.example.library_management.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(int id) {
        return authorRepository.findById((long) id).orElse(null);
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById((long) id);
    }

    public Author createAuthor(Author author) {

            return authorRepository.save(author);
    }

    public Author updateAuthor(int id, Author author) {

                return authorRepository.save(author);
    }
}