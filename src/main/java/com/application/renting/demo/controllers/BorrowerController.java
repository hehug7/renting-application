package com.application.renting.demo.controllers;

import com.application.renting.demo.Borrower;
import com.application.renting.demo.DAO.BorrowerDAO;
import com.application.renting.demo.responses.UserStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BorrowerController {

    public static final BorrowerDAO borrowerDAO = new BorrowerDAO();

    @GetMapping("/borrower")
    public Optional<Borrower> borrower(@RequestParam(value = "userId", defaultValue = "-1") Integer userId) {
        return borrowerDAO.get(userId);
    }

    @GetMapping("/createborrower")
    public UserStatus createborrower(@RequestParam(value = "ssn", defaultValue = "-1") String ssn,
                               @RequestParam(value = "name", defaultValue = "testuser") String name) {
        return borrowerDAO.save(new Borrower(ssn, name));
    }
}