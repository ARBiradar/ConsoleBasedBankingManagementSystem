# 🏦 Java Banking Management System

<p align="center">
  <b>A Console-Based Banking Application Built with Core Java</b>
  <br/>
  Demonstrating Object-Oriented Programming, Custom Exceptions, and Real-World Banking Workflows.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/OOP-Object--Oriented-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Exception-Custom%20Handling-red?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-In%20Development-yellow?style=for-the-badge" />
</p>

---

## 📌 Overview

The **Java Banking Management System** is a console-based application developed using Core Java to simulate essential banking operations. It provides a simple banking environment where customers can deposit money, withdraw funds, transfer amounts between accounts, check balances, and apply for loans.

The project focuses on implementing Object-Oriented Programming (OOP), interface-based abstraction, encapsulation, method overriding, and custom checked exceptions to handle banking-related errors.

It is designed as a learning project to strengthen Java programming fundamentals and demonstrate practical implementation of business logic.

## ✨ Features

* 💰 **Deposit:** Add money to a customer's bank account with amount validation.
* 💸 **Withdrawal:** Withdraw funds from an account with balance checks.
* 🔄 **Fund Transfer:** Transfer money between customer accounts with sender debit and receiver credit.
* 🏦 **Loan Application:** Apply for a loan based on predefined eligibility criteria.
* 📊 **Balance Inquiry:** View the current balance of a customer account.
* 👤 **Customer Management:** Work with predefined customer records.
* ⚠️ **Custom Exception Handling:** Handle banking errors using user-defined checked exceptions.
* 🖥️ **Console Interface:** Interact with banking operations through a menu-driven interface.

## 🛠️ Tech Stack

| Technology         | Purpose                                   |
| ------------------ | ----------------------------------------- |
| Java               | Core application development              |
| OOP                | Encapsulation, abstraction and interfaces |
| Custom Exceptions  | Handling banking-specific errors          |
| Java IO            | Console input and output                  |
| Switch Expressions | Menu-based operation selection            |

## 🧠 OOP Concepts Implemented

| Concept            | Implementation                                                                 |
| ------------------ | ------------------------------------------------------------------------------ |
| Encapsulation      | Private account fields with getters and setters                                |
| Abstraction        | `Bank` interface defining banking operations                                   |
| Inheritance        | Custom exceptions extend `Exception`                                           |
| Polymorphism       | `BankAccount` implements and overrides interface methods                       |
| Method Overriding  | Implementation of `deposit()`, `withdraw()`, `transfer()` and `applyForLoan()` |
| Exception Handling | `try-catch` blocks and custom checked exceptions                               |

## 🏗️ Project Structure

```text
Java-Banking-Management-System/
│
└── src/
    └── com/
        └── adarsh/
            └── CustomException/
                └── ATM.java
```

The application currently contains the banking interface, account class, customer class, custom exceptions and console-based main program.

## ⚙️ Banking Operations

### 1. Deposit

Allows customers to deposit money into their accounts. The application validates the amount before updating the balance.

### 2. Withdrawal

Allows customers to withdraw funds, subject to the account's available balance and amount validation.

### 3. Fund Transfer

Transfers money between two customer accounts. The sender's balance is reduced, and the receiver's balance is increased by the transfer amount.

### 4. Loan Application

Simulates a basic loan application process using predefined eligibility conditions, including the account balance and a maximum loan limit of ₹50,000.

### 5. Balance Inquiry

Displays the current account balance for a selected customer.

## ⚠️ Custom Exceptions

The application uses custom checked exceptions to represent banking-specific errors.

| Exception                    | Purpose                                                                   |
| ---------------------------- | ------------------------------------------------------------------------- |
| `InsufficientFundsException` | Raised when the sender does not have enough funds                         |
| `InvalidAmountException`     | Raised when an amount is invalid                                          |
| `AccountNotFoundException`   | Raised when the destination account is unavailable                        |
| `LoanNotAllowedException`    | Raised when the loan application does not satisfy the predefined criteria |

These exceptions make error handling more meaningful and help separate exceptional conditions from normal banking operations.

## 🚀 Getting Started

### Prerequisites

* Java JDK 25 or a compatible version supporting the `java.lang.IO` API used in this project.
* An IDE such as IntelliJ IDEA, Eclipse or VS Code.
* Basic understanding of Java.

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/ARBiradar/Java-Banking-Management-System.git
```

**2. Navigate to the project directory**

```bash
cd Java-Banking-Management-System
```

**3. Open the project**

Import the project into your preferred Java IDE and locate `ATM.java` in the source directory.

**4. Run the application**

Run the `ATM.java` file from your IDE.

If you use the command line, compile and run it with the appropriate source directory and package configuration for your project.

## 🖥️ Application Menu

```text
       Select an option :

          1. Deposit
          2. Withdraw
          3. Transfer
          4. Loan Application
          5. Check Balance
          6. Exit

Enter Choice:
```

## 📋 Sample Transaction

**Fund Transfer**

```text
Select an option:
3

Enter Customer Name: Alice
Enter amount to transfer: 11000

Deposit successful. New balance: 14000.0
Transfer successful.
```

*Example assumes Alice has an initial balance of ₹25,000 and the receiving account has ₹3,000.*

## 🔒 Current Limitations

This is a console-based educational project and is not intended for handling actual financial transactions.

* Customer records are predefined in the source code.
* Account data is stored in memory and is not persistent.
* No authentication or authorization is implemented.
* No database integration or transaction history is currently available.
* Loan eligibility is based on simplified demo rules.
* Production-grade concurrency control and transactional rollback are not implemented.
* No graphical user interface or REST API is available.

## 🔮 Future Enhancements

* [ ] Integrate MySQL or PostgreSQL for persistent storage.
* [ ] Implement Spring Boot REST APIs.
* [ ] Add customer registration and authentication.
* [ ] Introduce transaction history with unique transaction IDs.
* [ ] Use `BigDecimal` for monetary calculations.
* [ ] Implement atomic fund transfers and concurrency control.
* [ ] Add JUnit testing and integration tests.
* [ ] Develop a responsive React-based user interface.
* [ ] Implement role-based access control and audit logging.

## 🎯 Learning Outcomes

Through this project, I am strengthening my understanding of:

* Core Java and object-oriented programming.
* Interfaces, abstraction and method overriding.
* Custom checked exceptions and structured exception handling.
* Encapsulation and class-based application design.
* Conditional logic and menu-driven console applications.
* Translating basic banking requirements into Java business logic.

## 👨‍💻 Author

**Adarsh Biradar**

Java Full Stack Developer | Spring Boot | Prompt Engineering | Generative AI

📍 Bengaluru, Karnataka, India

* GitHub: [ARBiradar](https://github.com/ARBiradar)
* LinkedIn: [Adarsh Biradar](https://www.linkedin.com/)

## 📄 License

This project is developed for educational and learning purposes. You may use it as a reference for understanding Core Java and object-oriented programming.

---

<p align="center">
  <b>Built with Java ☕ by Adarsh Biradar</b>
  <br/>
  <i>Learning, building, and improving one project at a time.</i>
</p>
