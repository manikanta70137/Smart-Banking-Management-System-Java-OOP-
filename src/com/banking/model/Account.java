package com.banking.model;

import com.banking.exception.InvalidAmountException;

public abstract class Account {

    protected int accountNumber;
    protected String holderName;
    protected double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // MUST declare throws (checked exception)
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    // Abstract withdraw
    public abstract void withdraw(double amount) throws Exception;

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder    : " + holderName);
        System.out.println("Balance   : " + balance);
        System.out.println("---------------------------------");
    }
}
