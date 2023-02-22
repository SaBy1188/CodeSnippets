package de.basics.exception.devisionbyzero;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.ergebnis = 2;

        try {
            calculator.geteilt(2);
        } catch(DivisionByZeroException exception) {
            System.out.println("Zahl " + exception.getErgebnis() + " lässt sich nicht durch 0 teilen" );
        }
    }
}