package com.example.library_management.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AuthorDTO {

    private int id;
    private String name;
    private List<Integer> bookIds; // List of book IDs associated with the author

}