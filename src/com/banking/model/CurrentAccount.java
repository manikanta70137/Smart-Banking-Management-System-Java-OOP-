package com.banking.model;

import com.banking.exception.InsufficientBalanceException;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Withdrawal denied. Insufficient balance.");
        }
        balance -= amount;
    }
}
