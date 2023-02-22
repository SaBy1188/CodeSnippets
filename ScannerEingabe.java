package de.basics;
import java.util.Scanner;
public class ScannerEingabe {
    public static void main(String[] args) {

        // Objekt Scanner aufrufen
        Scanner sc = new Scanner(System.in);

        // Eingabe
        String inputString = sc.next();
        int inputInt = sc.nextInt();
        double inputDouble = sc.nextDouble();

        // Scanner schließen
        sc.close();
    }
}