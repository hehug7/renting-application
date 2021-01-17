package com.application.renting.demo.controllers;

import com.application.renting.demo.Borrower;
import com.application.renting.demo.DAO.LoanDAO;
import com.application.renting.demo.Loan;
import com.application.renting.demo.ApplicationStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    private LoanDAO loanDAO = new LoanDAO();

    @GetMapping("/loan")
    public ApplicationStatus loan(@RequestParam(value = "applicationNo", defaultValue = "-1") Integer applicationNo) {
        return new ApplicationStatus(applicationNo, loanDAO.get(applicationNo));
    }

    @GetMapping("/addloan")
    public Loan loan(@RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name,
                     @RequestParam(value = "name", defaultValue = "World") List<Borrower> name) {

        //return loanDAO.save(new Loan().getApplicationNo());
        return null;
    }
}

/*

{
  "lanetakere": [{ "fnr" : "01056000069", "navn" : "Kari Nordmann" } , { "fnr" : "01056000301", "navn" : "Ola Nordmann" }],
  "lanebelop": 2450000,
  "behov": "Vi skal låne penger til........",
  "lopetid": 300,
  "avdragsfriPeriode": 12,
  "type": "annuitet"
}

 */