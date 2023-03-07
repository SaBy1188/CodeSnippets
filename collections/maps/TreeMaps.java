package de.basics.collections.maps;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentScores = new TreeMap<>( );
        studentScores.put("Alice",92);
        studentScores.put("Bob",85);
        studentScores.put("Charlie",77);

        System.out.println("First student: " + studentScores.firstKey( ));
        System.out.println("Last student: " + studentScores.lastKey( ));
    }
}