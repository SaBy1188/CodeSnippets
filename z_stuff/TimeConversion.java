package de.basics.z_stuff;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        // M O D U L O  O P E R A T O R
        // Zeitumrechnung


        /**Scanfunktion zur Abfrage der Sekunden.*/
        Scanner scanSeconds = new Scanner(System.in);

        System.out.println("How many seconds do you want to convert?");
        int enterSeconds = scanSeconds.nextInt();


        /**Umrechnung der Eingabe zu Stunden, Minuten und Sekunden.*/
        int years = enterSeconds / 31536000;
        int days = (enterSeconds % 31536000) / 86400;
        int hours = ((enterSeconds % 31536000) % 86400) / 3600;
        int minutes = (((enterSeconds % 31536000) % 86400) % 3600) / 60;
        int seconds = (((enterSeconds % 31536000) % 86400) % 3600) % 60;

        System.out.println("You entered " + enterSeconds + " seconds.\n"
                + "This is the equivalent of "
                + years + " years, "
                + days + " days, "
                + hours + " hours, "
                + minutes + " minutes and "
                + seconds + " seconds.");
    }
}