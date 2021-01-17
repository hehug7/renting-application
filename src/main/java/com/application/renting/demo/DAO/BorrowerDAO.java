package com.application.renting.demo.DAO;

import com.application.renting.demo.Borrower;

import java.util.List;
import java.util.Optional;

public class BorrowerDAO implements DAO<Borrower> {


    @Override
    public Optional<Borrower> get(int id) {
        return Optional.empty();
    }

    @Override
    public List<Borrower> getAll() {
        return null;
    }

    @Override
    public int save(Borrower borrower) {
        return -1;
    }

    @Override
    public int update(Borrower borrower, String[] params) {
        return -1;
    }

    @Override
    public int delete(Borrower borrower) {
        return -1;
    }
}
