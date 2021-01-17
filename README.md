# renting-application
A task given by a job offer.

## Prerequisites

- JDK 1.8+
- Spring
- Min. Java 8
- Hibernate ORM v5.4+
- Maven 3.2+
- Java 11+

## Setup
1. Clone repo
2. Install Maven dependencies by inserting `mvn clean install -U` in terminal while in root directory
3. Run application by writing `./mvnw spring-boot:run` in terminal while in root directory

## Tasks
The application should
- be able to receive a loan application through a GET method. 
- be able to save received loan applications in a non-persistent way. 
- send a response message containing an application number when receiving a new loan application.
- be able to receive a GET request which includes an application number. 
- send a response message containing an application number and application status when receiving an application number.

## System description
When calling the GET method `/loan?applicationNo=0`, the `LoanController.java` calls `DAO/LoanDAO.java`'s get-method. One loan application is already stored non-peristent inside the `DAO/LoanDAO.java`.
When receiving this call, the function returns an Optional<Loan> which is either a loan or empty. The fact whether it is found or not is used by the `ApplicationStatus.java` class to give a response with "received" or "unknown".
This is returned by the `LoanController.java`. The `DAO/BorrowerDAO.java` and the `BorrowerController.java` is created to showcase optional features which is relevant in this regard, see attached sequence diagram.
  
- Loan is defined in the `Loan.java` class in the path `src/main/java/com.application.renting.demo`. This class is the structure for the loan application.
- Borrower is defined in the Borrower.java class located in the same path as the `Loan.java class`. Defines the structure for a borrower.
- BorrowerController for POST and GET request for borrowers.
- LoanController for POST and GET request regarding loans.
- In the `controller` package is where the Spring controllers are.
- The `DAO` package contains all data access objects and is now used for non-persistance storage.
- The `responses` package contains all response objects. `UserStatus.java` for response when creating a user, and `ApplicationStatus.java` for creating an application.


## Changes
- After basing a loan application on the given .json, I have added an application ID to the loan application.
- I like to programme in english to prevent issues regarding UTF-8 characters in variables and to avoid using reserved words such as "type".
- Changes "type" from String to enum format to make it clear it is a type and to prevent future potential bugs.
- Hibernate is chosen because it is a better alternative in the long run compared to JDBC. Hibernate support features such as easy implementation of associations and more.

## TODO
- Did not make a front-end part due to time. I would have used React and not AngularJS, because it is easier to implement in React. Also, it is common which makes it easier to find documents.
- Privacy concerns when storing or handling ssn (GDPR). Lack of encryption, is an isolated service? etc.