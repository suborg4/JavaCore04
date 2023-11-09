package javacorehw03.utils;

// исключение вызываемое при недостаточных средствах на счете
public class InsufficientFundsException extends Exception {
    private double balance;
    
    public InsufficientFundsException(String message, double balance) {
        super(message);
        this.balance = balance;
    }
    
    // Геттер для текущего баланса
    public double getBalance() {
        return balance;
    }
}