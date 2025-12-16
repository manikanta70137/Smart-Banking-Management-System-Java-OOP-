package com.banking;

import com.banking.model.*;
import com.banking.service.*;

public class Main {

    public static void main(String[] args) {

        BankService bankService = new BankServiceImpl();

        Account savings = new SavingsAccount(101, "Manikanta", 5000);
        Account current = new CurrentAccount(102, "Ravi", 8000);
        Account loan = new LoanAccount(103, "Anita", 200000);

        bankService.deposit(savings, 1500);
        bankService.withdraw(savings, 2000);

        bankService.withdraw(current, 3000);
        bankService.withdraw(loan, 1000);

        System.out.println("\n--- Account Details ---");
        bankService.displayAccount(savings);
        bankService.displayAccount(current);
        bankService.displayAccount(loan);
    }
}
