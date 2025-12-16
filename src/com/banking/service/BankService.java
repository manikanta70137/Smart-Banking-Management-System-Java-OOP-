package com.banking.service;

import com.banking.model.Account;

public interface BankService {

    void deposit(Account account, double amount);

    void withdraw(Account account, double amount);

    void displayAccount(Account account);
}
