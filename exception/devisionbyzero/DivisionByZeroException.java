package de.basics.exception.devisionbyzero;

public class DivisionByZeroException extends Exception {
    private long ergebnis;

    public DivisionByZeroException(long ergebnis) {
        this.ergebnis = ergebnis;
    }

    public long getErgebnis() {
        return this.ergebnis;
    }
}