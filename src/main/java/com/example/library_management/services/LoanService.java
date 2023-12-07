package com.example.library_management.services;

import com.example.library_management.entities.Loan;
import com.example.library_management.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoanById(int id) {
        return loanRepository.findById((long) id).orElse(null);
    }

    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public void deleteLoan(int id) {
        loanRepository.deleteById((long) id);
    }

    public Loan createLoan(Loan loan) {

            return loanRepository.save(loan);
    }

    public Loan updateLoan(int id, Loan loan) {

                return loanRepository.save(loan);
    }
}