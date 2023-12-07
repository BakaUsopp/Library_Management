package com.example.library_management.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "roll_no")
    private String RollNo;

    private String name;

    private String email;

    @OneToMany(mappedBy = "student")
    private List<Loan> loans;
}