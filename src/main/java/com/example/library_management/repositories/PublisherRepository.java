package com.example.library_management.repositories;

import com.example.library_management.entities.Book;
import com.example.library_management.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
