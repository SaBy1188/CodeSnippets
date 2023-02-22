package de.basics.exception.devisionbyzero;

public class Calculator {
    long ergebnis;
    public long geteilt(long zahlB) throws DivisionByZeroException {
        if(zahlB != 0) {
            ergebnis = ergebnis / zahlB;
        } else {
            throw new DivisionByZeroException(ergebnis);
        }
        return ergebnis;
    }

    public long getErgebnis( ) { return ergebnis; }
}