package com.application.renting.demo.controllers;

import com.application.renting.demo.Borrower;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowerController {

    @GetMapping("/borrower")
    public Borrower borrower(@RequestParam(value = "ssn", defaultValue = "-1") String ssn, @RequestParam(value = "name", defaultValue = "testuser") String name) {
        return new Borrower(ssn, name);
    }
}