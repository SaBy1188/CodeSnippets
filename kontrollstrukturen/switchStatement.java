package de.basics.kontrollstrukturen;

public class switchStatement {
public static void main(String[] args) {

    int number = 2;
    // Konstante abfragen (falls)

    switch(number) {
        case 1:
            System.out.println("Nummer eins");break;
        case 2:
            System.out.println("Nummer zwei");break;
        case 3:
            System.out.println("Nummer drei");break;
        default:
            System.out.println("wertlos");
    }
}
}