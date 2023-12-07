package com.example.library_management.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookDTO {

    private int id;
    private String title;
    private String isbn;
    private int authorId; // ID of the author of the book
    private int publisherId; // ID of the publisher of the book
    private List<Integer> loanIds; // List of loan IDs associated with the book
}