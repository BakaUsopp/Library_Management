package com.example.library_management.services;

import com.example.library_management.entities.Publisher;
import com.example.library_management.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private final PublisherRepository publisherRepository;

    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public Publisher getPublisherById(int id) {
        return publisherRepository.findById((long) id).orElse(null);
    }

    public Publisher savePublisher(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(int id) {
        publisherRepository.deleteById((long) id);
    }

    public Publisher createPublisher(Publisher publisher) {

            return publisherRepository.save(publisher);
    }

    public Publisher updatePublisher(int id, Publisher publisher) {

                    return publisherRepository.save(publisher);
    }
}