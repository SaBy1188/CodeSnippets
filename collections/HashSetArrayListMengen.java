package de.basics.collections;

import java.util.*;
import java.util.HashSet;
import java.util.List;

public class HashSetArrayListMengen {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1,2,3,4,5,6);
        List<Integer> listB = Arrays.asList(4,5,6,7,8,9);


        // Vereinigungsmengen mit HashSet
        HashSet<Integer> setAll = new HashSet<>( );
        setAll.addAll(listA);
        setAll.addAll(listB);
        System.out.println("Vereinigungsmenge mit HashSet: " + setAll);


        // Vereinigungsmenge ohne HashSet
        List<Integer> vereinigungsmenge = new ArrayList<>(listA);

        for(Integer element : listB) {
            if(!vereinigungsmenge.contains(element)) {
                vereinigungsmenge.add(element);
            }
        }
        System.out.println("Vereinigungsmenge ohne HashSet: " + vereinigungsmenge);


        // Schnittmenge
        List<Integer> schnittmenge = new ArrayList<>(listA);
        schnittmenge.retainAll(listB);
        System.out.println("Schnittmenge ohne HashSet: " + schnittmenge);


        // Schnittmenge mit HashSet
        Set<Integer> schnittmengeHashSet = new HashSet<>(listA);
        schnittmengeHashSet.retainAll(listB);
        System.out.println("Schnittmenge mit HashSet: " + schnittmengeHashSet);


        // Differenzmenge mit FOREACH
        List<Integer> difference = new ArrayList<>( );

        for(int x : listA) {
            if(!listB.contains(x)) difference.add(x);
        }

        for(int x : listB) {
            if(!listA.contains(x)) difference.add(x);
        }
        System.out.println("Differenzmenge ohne HashSet: " + difference);


        // Differenzmenge mit HashSet
/*        Set<Integer> differenceHashSet = new HashSet<>(listA);
        differenceHashSet.remove(schnittmenge);
        System.out.println("Differenzmenge mit HashSet: " + differenceHashSet);*/
    }
}