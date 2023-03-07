package de.basics.z_stuff;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // S C A N N E R
        // Scannereingabe
        Scanner scannerRandomNumber = new Scanner(System.in);

        /**Gibt an innerhalb welches Spektrums die Zufallszahl ausgewählt werden soll.
         * Math.random wählt eine Zahl zwischen 0 und 1.
         * * 100 erweitert das Spektrum auf Ganzzahlen und + 1 sorgt dafür, dass die Null ausgeschlossen wird.*/
        int randomNumber = (int) ((Math.random() * 100) + 1);
        int count = 0;

        System.out.println("Guess what number is being searched for. It ranges between 0 and 100.");


        /**Die Schleife wird so lange wiederholt, bis die Zahl erraten wurde.*/
        int tip = 0;
        while (tip != randomNumber) {
            count++;
            System.out.println("Your " + count + ". try: ");
            tip = scannerRandomNumber.nextInt();

            if (tip == randomNumber) {
                System.out.println("Lucky you."
                        + "You entered the number" + " (" + tip + ")"
                        + ". This is correct.");
            } else if (tip < randomNumber) {
                System.out.println("""
            Bad luck.
            This number is too small.
            Try again.
            """);
            } else if (tip > randomNumber) {
                System.out.println("""
            Oopsie.
            The number is too big.
            Next try.
            """);
            } else {
                scannerRandomNumber.close();
            }
        }
    }
}