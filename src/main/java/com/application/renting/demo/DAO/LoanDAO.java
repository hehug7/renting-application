package com.application.renting.demo.DAO;

import com.application.renting.demo.Borrower;
import com.application.renting.demo.Loan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LoanDAO implements DAO<Loan> {

    private List<Loan> loans = new ArrayList<>();

    public LoanDAO() {
        List<Borrower> borrowers = new ArrayList<>();
        borrowers.add(new Borrower("01056000069", "Kari Nordmann"));
        borrowers.add(new Borrower("01056000301", "Ola Nordmann"));

        loans.add(new Loan(borrowers, 2450000, "Vi skal låne penger til........", 300, 12, Loan.loanType.ANNUITET));
    }

    @Override
    public Optional<Loan> get(int id) {
        return loans.stream().filter(l -> l.getApplicationNo() == id).findFirst();
    }

    @Override
    public List<Loan> getAll() {
        return loans;
    }

    @Override
    public int save(Loan loan) {
        loans.add(loan);
        return loan.getApplicationNo();
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
