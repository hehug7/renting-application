package com.application.renting.demo.controllers;

import com.application.renting.demo.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan loan(@RequestParam(value = "name", defaultValue = "World") String name) {

        return null;
    }
}