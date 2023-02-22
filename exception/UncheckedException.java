package de.basics.exception;

public class UncheckedException {
    public static void main(String[] args) {
        // Hier wird eine unchecked Exception verursacht
        // Exception wird in Konsole ausgegeben
        // Programm bleibt aber kompilierfähig
        String string = null;
        string.toUpperCase();
    }
}