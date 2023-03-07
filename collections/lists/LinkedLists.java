package de.basics.collections.lists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>( );
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("First name: " + names.getFirst( ));
        System.out.println("Last name: " + names.getLast( ));
    }
}