package de.basics.arrays;

public class MehrdimensionaleArrays {
public static void main(String[] args) {
    String[][] matrixArray = {
            {"Z0 S0","Z0 S1","Z0 S2"},
            {"Z1 S0","Z1 S1","Z1 S2"}};

    System.out.println(matrixArray[1][0]);

    String[][] names = new String[3][2];
    names[0][0] = "Hans-Meyer";
    names[0][1] = "Bockwurst";

    names[1][0] = "Franz";
    names[1][1] = "Nagelneu";

    names[2][0] = "Peter";
    names[2][1] = "Unlustig";

    for(int i = 0; i < names.length; i++) {
        for(int j = 0; j < names[i].length; j++) {
            System.out.print(names[i][j]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
}