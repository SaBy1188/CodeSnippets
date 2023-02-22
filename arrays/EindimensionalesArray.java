package de.basics.arrays;

public class EindimensionalesArray {
    public static void main(String[] args) {
        int[ ] arrays = new int[3];
        arrays[0] = 12;
        arrays[1] = 13;
        arrays[2] = 14;

        // Kurzschreibweise
        int[ ] arrayShortcut = { 1, 2, 3, 4, 5};

        for(int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("fertig");

        System.out.println(arrays[1]);
    }
}