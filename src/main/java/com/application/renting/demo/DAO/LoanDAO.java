package com.application.renting.demo.DAO;

import com.application.renting.demo.controllers.BorrowerController;
import com.application.renting.demo.responses.ApplicationStatus;
import com.application.renting.demo.Borrower;
import com.application.renting.demo.Loan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LoanDAO implements DAO<Loan> {

    private final List<Loan> loans = new ArrayList<>();

    public LoanDAO() {
        if (BorrowerController.borrowerDAO.getAll().size() == 0) {
            BorrowerController.borrowerDAO.save(new Borrower("01056000069", "Kari Nordmann"));
            BorrowerController.borrowerDAO.save(new Borrower("01056000301", "Ola Nordmann"));
        }

        save(new Loan(new ArrayList<>(Arrays.asList(0,1)), 2450000, "Vi skal låne penger til........", 300, 12, "annuitet"));
    }

    @Override
    public Optional<Loan> get(int id) {
        return loans.stream().filter(l -> l.getApplicationNo() == id).findFirst();
    }

    @Override
    public List<Loan> getAll() {
        return loans;
    }

    public ApplicationStatus save(Loan loan) {
        loans.add(loan);
        return new ApplicationStatus(loan.getApplicationNo(), get(loan.getApplicationNo()));
    }

    @Override
    public int update(Loan loan, String[] params) {
        return loan.getApplicationNo();
    }

    @Override
    public int delete(Loan loan) {
        // Consider try-catch  with correct handling when no loan is found
        for (Loan l :
                loans) {
            if (l.getApplicationNo() == loan.getApplicationNo()) {
                loans.remove(l);
                return l.getApplicationNo();
            }
        }
        return -1;
    }
}
