package com.application.renting.demo;

public class Borrower {

    public static int userIdCounter = 0;

    private final int userId;
    private final String ssn;
    private String name;

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public void setName() { this.name = name; }


    public int getUserId() {
        return userId;
    }
    public Borrower(String ssn, String name) {
        userId = userIdCounter;
        this.ssn = ssn;
        this.name = name;
    }
}
