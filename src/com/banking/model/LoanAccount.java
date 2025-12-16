package com.banking.model;

public class LoanAccount extends Account {

    public LoanAccount(int accountNumber, String holderName, double loanAmount) {
        super(accountNumber, holderName, loanAmount);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        throw new Exception("Withdrawals are not allowed for loan accounts.");
    }
}
