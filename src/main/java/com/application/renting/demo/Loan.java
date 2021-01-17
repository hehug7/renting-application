package com.application.renting.demo;

import java.util.List;

public class Loan {

    private static int applicationNoCounter = 0;

    private final int applicationNo;
    private List<Borrower> borrowers;
    private int loanAmount;
    private String need;
    private int period;
    private int deductablePeriod;
    private loanType category;

    public enum loanType {
        ANNUITET,
        SERIE
    }

    public int getApplicationNo() {
        return applicationNo;
    }

    public List<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(List<Borrower> borrowers) {
        this.borrowers = borrowers;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getDeductablePeriod() {
        return deductablePeriod;
    }

    public void setDeductablePeriod(int deductablePeriod) {
        this.deductablePeriod = deductablePeriod;
    }

    public loanType getCategory() {
        return category;
    }

    public void setCategory(loanType category) {
        this.category = category;
    }

    // Minor change: A loan should have an ID
    public Loan(List<Borrower> borrowers, int loanAmount, String need, int period, int deductablePeriod, loanType category) {
        if (!TestIsSSNValid(borrowers, loanAmount, period, deductablePeriod)) {
            throw new IllegalArgumentException("Not a valid loan"); // Should be an argument for each case
        }
        this.applicationNo = applicationNoCounter++;
        this.borrowers = borrowers;
        this.loanAmount = loanAmount;
        this.need = need;
        this.period = period;
        this.deductablePeriod = deductablePeriod;
        this.category = category;
    }

    /**
     * This method will validate the loan values. Not all values will be properly checked as this works as an example
     * @return  Whether the loan is valid
     */
    private boolean TestIsSSNValid(List<Borrower> borrowers, int loanAmount, int period, int deductablePeriod) {
        // Examples
        if (loanAmount < 0 || period < 0 || deductablePeriod < 0) {
            return false;
        }

        if (borrowers.size() == 0) {
            return false;
        }

        // ..

        return true;

    };

}