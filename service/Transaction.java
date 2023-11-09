package javacorehw03.service;

import model.Account;
import model.InsufficientFundsException;

// транзакция между счетами
public class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount) throws InsufficientFundsException {
        if (amount > fromAccount.getBalance()) {
            throw new InsufficientFundsException("Недостаточно средств на счете", fromAccount.getBalance());
        }
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}