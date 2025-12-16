package com.banking.service;

import com.banking.model.Account;
import com.banking.exception.InvalidAmountException;
import com.banking.exception.InsufficientBalanceException;

public class BankServiceImpl implements BankService {

    @Override
    public void deposit(Account account, double amount) {
        try {
            account.deposit(amount);   // throws checked exception
            System.out.println("Deposit successful.");
        } catch (InvalidAmountException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }

    @Override
    public void withdraw(Account account, double amount) {
        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Operation failed: " + e.getMessage());
        }
    }

    @Override
    public void displayAccount(Account account) {
        account.displayAccountInfo();
    }
}
