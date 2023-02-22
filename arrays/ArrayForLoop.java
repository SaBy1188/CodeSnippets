package de.basics.arrays;

public class ArrayForLoop {
public static void main(String[] args) {
    int[][] matrixArray = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Äußere FOR-Schleife: Zeilenindex -> i
    for(int i = 0; i < matrixArray.length; i++) {

        // Innere FOR-Schleife: Spaltenindex -> j
        for(int j = 0; j < matrixArray[i].length; j++) {
            System.out.print(matrixArray[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
}