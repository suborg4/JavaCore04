package javacorehw03.service;

import model.Account;
import model.InsufficientFundsException;

// методы для работы с банковскими счетами
public class AccountService {
    public static void main(String[] args) {
        try {
            // Создание счета с начальным балансом
            Account account = new Account(1000);
            
            // Депозит
            account.deposit(500);
            
            // Снятие средств
            account.withdraw(200);
            
            // Вывод текущего баланса
            System.out.println("Текущий баланс: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage() + ", текущий баланс: " + e.getBalance());
        }
    }
}