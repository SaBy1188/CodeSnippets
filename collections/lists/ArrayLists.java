package de.basics.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    private static List<Integer> arrayList = new java.util.ArrayList<>( );

    public static void main(String[] args) {
        // .add()
        // .remove()
        // .get()

        arrayList.add(100);
        arrayList.add(53);
        arrayList.add(25);
        arrayList.add(45);
        arrayList.add(12);
        arrayList.add(-65);
        arrayList.add(-200);
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        arrayList.remove(2);

        arrayList.sort((i1, i2) -> {
            if (i1 > i2) {
                return -1;
            } else if (i1 < i2) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(arrayList);
        System.out.println(arrayList.contains(12) ? "12 ist in der Liste " : "12 ist nicht in der Liste");
        System.out.println(arrayList.size());

        List<Integer> testList = new java.util.ArrayList<>(List.of(13,14,16,23,26,45,76,55));
        List<Integer> geradeZahlen = new java.util.ArrayList<>();

        for(int i = 0; i < testList.size(); i++) {
            System.out.println(testList.get(i) );
            if (testList.get(i) % 2 == 0) {
                geradeZahlen.add(testList.get(i));
            }
        }

        System.out.println(testList );
        System.out.println(geradeZahlen );

        // arrayList.sort(Comparator.reverseOrder());

        //
        List<Integer> zahlenAb50 = new ArrayList<>(List.of(13,14,16,23,26,45,76,55));

        for(int i = 0; i < zahlenAb50.size(); i++) {
            System.out.println("Index " + i + ": " + zahlenAb50.get(i) + " Size: " + zahlenAb50.size());
            if (zahlenAb50.get(i) > 50) {
                zahlenAb50.remove(i);
            }
        }
    }
}