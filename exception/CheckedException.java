package de.basics.exception;

import java.io.IOException;

public class CheckedException {
    // Checked Exception abfangen und behandeln
    // Programm bleibt ablauffähig bei Behandlung der Exception
    public static void main(String[] args) {

        try {
            testMethode();
        } catch(IOException exception) {
            System.out.println("Programm abgebrochen: " + exception.getMessage());
        }
        System.out.println("Programm läuft");
    }

    private static void testMethode() throws IOException {
        throw new IOException("Dateizugriff unmöglich");
    }
}