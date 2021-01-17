package com.application.renting.demo;

public class Borrower {

    private final String ssn;
    private final String name;

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public Borrower(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

}
