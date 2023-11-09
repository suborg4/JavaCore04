package javacorehw03.model;

// дебетовый счет, наследуется от Account
public class DebitAccount extends Account {
    public DebitAccount(double initialBalance) {
        super(initialBalance);
    }
}