package com.example.library_management.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoanDTO {

    private int id;
    private int studentId; // ID of the student who took the loan
    private int bookId; // ID of the book that was loaned
    private Date loanDate;
    private Date returnDate;
}