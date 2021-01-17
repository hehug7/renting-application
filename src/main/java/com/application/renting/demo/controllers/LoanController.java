package com.application.renting.demo.controllers;

import com.application.renting.demo.DAO.LoanDAO;
import com.application.renting.demo.Loan;
import com.application.renting.demo.responses.ApplicationStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoanController {

    public static final LoanDAO loanDAO = new LoanDAO();

    @GetMapping("/loan")
    public ApplicationStatus loan(@RequestParam(value = "applicationNo", defaultValue = "-1") Integer applicationNo) {
        return new ApplicationStatus(applicationNo, loanDAO.get(applicationNo));
    }

    @GetMapping("/createloan")
    public ApplicationStatus loan(@RequestParam(value = "lanetakere") List<Integer> borrowers,
                     @RequestParam(value = "lanebelop", defaultValue = "0") Integer loanAmount,
                     @RequestParam(value = "behov", defaultValue = "") String need,
                     @RequestParam(value = "lopetid", defaultValue = "0") Integer period,
                     @RequestParam(value = "avdragsfriPeriode", defaultValue = "0") Integer deductablePeriod,
                     @RequestParam(value = "type", defaultValue = "annuitet") String category) {

        return loanDAO.save(new Loan(borrowers, loanAmount, need, period, deductablePeriod, category));
    }
}