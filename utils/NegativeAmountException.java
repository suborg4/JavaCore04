package javacorehw03.utils;

// исключение вызываемое при попытке создать счет с отрицательным балансом или внести отрицательную сумму
public class NegativeAmountException extends IllegalArgumentException {
    public NegativeAmountException(String message) {
        super(message);
    }
}