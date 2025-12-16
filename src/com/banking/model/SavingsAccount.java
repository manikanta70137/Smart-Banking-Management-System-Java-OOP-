package com.banking.model;

import com.banking.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {

    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientBalanceException(
                    "Withdrawal denied. Minimum balance of 1000 must be maintained.");
        }
        balance -= amount;
    }
}
