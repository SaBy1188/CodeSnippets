package de.basics.kontrollstrukturen;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many eyes you have?");

        int eyes = scanner.nextInt();

        // Bedingungen abfragen (falls)
        if (eyes > 2 || eyes < 1) {
            System.out.println("You're weird.");
        } else if (eyes == 2) {
            System.out.println("Good. You're human.");
        }
    }
}