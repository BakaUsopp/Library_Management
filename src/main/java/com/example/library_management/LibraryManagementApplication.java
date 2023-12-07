package com.example.library_management;

import com.example.library_management.entities.Book;
import com.example.library_management.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.stream.events.Comment;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }
//        String puName = "pu-name";
//        Map<String,String> props = new HashMap<>();
//        EntityManagerFactory emf = new HibernatePersistenceProvider()
//                .createContainerEntityManagerFactory(new Student( ), props);
//
//
//        EntityManager em = emf.createEntityManager();
//
//        try
//
//    {
//        em.getTransaction().begin();
//
//        Student s = new Student();
//        s.setName("One Piece");
//        s.setEmail("Anime");
//        s.setRollNo("1234");
//        em.getTransaction().commit();
//    }finally
//
//    {
//        em.close();
//    }




}
