# renting-application
A task given by a job offer.

## Prerequisites



## Setup
1. Clone repo
2. run `./mvnw spring-boot:run` in root directory


## Description
- Loan is defined in the Loan.java class in the path `src/main/java/com.application.renting.demo`. This class is the structure for the loan application.
- Borrower is deinfed in the Borrower.java class located in the same path as the Loan.java class. Defines the structure for a borrower.
- BorrowerController for POST and GET request for borrowers.
- LoanController for POST and GET request regarding loans.

## Changes
- After basing a loan application on the given .json, I have added an application ID to the loan application.
- I like to programme in english to prevent issues regarding UTF-8 characters in variables and to avoid using reserved words such as "type".

## TODO
- Did not make a front-end part
- Security issues such as social security number in the web address
- Security issues regarding encryption when storing for privacy concerns (GDPR)
