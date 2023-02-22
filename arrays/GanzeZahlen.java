package de.basics.arrays;

import java.util.ArrayList;

public class GanzeZahlen {

    // Methode, die eine neue Liste für gerade Zahlen erzeugt

    public static ArrayList<Integer> geradeZahlen(ArrayList<Integer> zahlen) {
        ArrayList<Integer> geradeZahlen = new ArrayList<>( );
        for(int zahl : zahlen) {
            if(zahl % 2 == 0) {
                geradeZahlen.add(zahl);
            }
        }
        return geradeZahlen;
    }

    public static void main(String[] args) {

        ArrayList<Integer> zahlen = new ArrayList<>( );
        zahlen.add(132);
        zahlen.add(-257);
        zahlen.add(3);
        zahlen.add(411);
        zahlen.add(-50);
        zahlen.add(6);

        System.out.println("Gefilterte Liste: " + geradeZahlen(zahlen));
    }
}