package javacorehw03.model;

// банковский счет
public class Account {
    private double balance;
    
    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }
    
    // Метод для депозита
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Сумма депозита не может быть отрицательной");
        }
        this.balance += amount;
    }
    
    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new InsufficientFundsException("Недостаточно средств на счете", this.balance);
        }
        this.balance -= amount;
    }
    
    // Геттер для текущего баланса
    public double getBalance() {
        return balance;
    }
}