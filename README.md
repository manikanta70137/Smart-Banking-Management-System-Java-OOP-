# Smart Banking Management System (Java OOP)

A fully object-oriented **Smart Banking Management System** built using **Java 17**, designed to simulate real-world banking operations with clean architecture and reusable components.  
This project demonstrates strong understanding of **Object-Oriented Programming principles**, service-layer design, and exception handling.

---

## 🚀 Features

- Multiple account types: **Savings, Current, Loan**
- Secure deposit and withdrawal operations
- Business-rule enforcement using custom exceptions
- Centralized service layer for transaction handling
- Clean separation of concerns (Model, Service, Exception layers)

---

## 🧠 OOP Concepts Implemented

- **Encapsulation**  
  Private/protected fields with controlled access methods

- **Abstraction**  
  Abstract `Account` class defining common behavior

- **Inheritance**  
  `SavingsAccount`, `CurrentAccount`, and `LoanAccount` extend `Account`

- **Polymorphism**  
  Overridden `withdraw()` method with account-specific behavior

---

## 🏗 Project Structure
Smart-Banking-Management-System-Java-OOP/
├── src/
│   └── com/
│       └── banking/
│           ├── Main.java
│           ├── model/
│           │   ├── Account.java
│           │   ├── SavingsAccount.java
│           │   ├── CurrentAccount.java
│           │   └── LoanAccount.java
│           ├── service/
│           │   ├── BankService.java
│           │   └── BankServiceImpl.java
│           └── exception/
│               ├── InvalidAmountException.java
│               └── InsufficientBalanceException.java
├── .gitignore
└── README.md



---

## ⚙️ Technologies Used

- **Java 17**
- **VS Code**
- **Git & GitHub**
- Object-Oriented Design Principles

---

## ▶️ How to Run the Project

### Prerequisites
- Java 17 installed
- Git installed
- VS Code (recommended)

### Steps
```bash
git clone https://github.com/manikanta70137/Smart-Banking-Management-System-Java-OOP-.git
cd Smart-Banking-Management-System-Java-OOP
javac src/com/banking/Main.java
java com.banking.Main

## 📌 Sample Output
Deposit successful.
Withdrawal successful.
Operation failed: Withdrawals are not allowed for loan accounts.

--- Account Details ---
Account No : 101
Holder    : Manikanta
Balance   : 4500.0
---------------------------------
