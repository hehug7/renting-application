package com.application.renting.demo.DAO;

import com.application.renting.demo.Borrower;
import com.application.renting.demo.responses.UserStatus;

import java.util.*;
import java.util.stream.Collectors;

public class BorrowerDAO implements DAO<Borrower> {

    private final List<Borrower> borrowers = new ArrayList<>();

    public BorrowerDAO() {
        save(new Borrower("01056000069", "Kari Nordmann"));
        save(new Borrower("01056000301", "Ola Nordmann"));
    }

    @Override
    public Optional<Borrower> get(int id) {
        return borrowers.stream().filter(b -> b.getUserId() == id).findFirst();
    }

    @Override
    public List<Borrower> getAll() {
        return borrowers;
    }

    public UserStatus save(Borrower borrower) {
        if (borrowers.stream().map(Borrower::getSsn).collect(Collectors.toList()).contains(borrower.getSsn())) {
            return new UserStatus(borrower.getUserId()-1, UserStatus.userstatus.ALREADY_EXISTS);
        }
        borrowers.add(borrower);
        Borrower.userIdCounter++;
        return new UserStatus(borrower.getUserId(), UserStatus.userstatus.CREATED);
    }

    @Override
    public int update(Borrower borrower, String[] params) {
        return -1;
    }

    @Override
    public int delete(Borrower borrower) {
        // Consider try-catch  with correct handling when no loan is found
        for (Borrower b :
                borrowers) {
            if (b.getUserId() == borrower.getUserId()) {
                borrowers.remove(b);
                return b.getUserId();
            }
        }
        return -1;
    }
}
