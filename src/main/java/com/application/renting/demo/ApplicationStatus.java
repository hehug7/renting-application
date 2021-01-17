package com.application.renting.demo;

import java.util.Optional;

public class ApplicationStatus {

    public int getApplicationNo() {
        return applicationNo;
    }

    public status getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(status applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public enum status {
        UNKNOWN,
        RECEIVED
    }
    private final int applicationNo;
    private status applicationStatus;

    public ApplicationStatus(int applicationNo, Optional<Loan> loan) {
        this.applicationNo = applicationNo;
        this.applicationStatus = loan.isEmpty() ? status.UNKNOWN : status.RECEIVED;
    }
}
