package de.basics.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesStacks {
    public static void main(String[] args) {
        Queue<String> warteschlange = new LinkedList<>( );

        // FIFO = first in first out
        warteschlange.add("1.");
        warteschlange.add("2.");
        warteschlange.add("3.");
        warteschlange.add("4.");

        // poll entnimmt erstes Element
        System.out.println("poll: ");
        System.out.println(warteschlange.poll( ));
        System.out.println(warteschlange.poll( ));
        System.out.println(warteschlange.poll( ));

        // size ermittelt die Array Größe
        System.out.println("size: " + warteschlange.size( ));


        // LIFO = last in first out
        Stack<String> stapel = new Stack<>( );

        stapel.push("1.");
        stapel.push("2.");
        stapel.push("3.");
        stapel.push("4.");

        System.out.println("first:" + stapel.firstElement( ));

        // peek zeigt das 1. Element, aber entfernt es nicht
        System.out.println("peek:" + stapel.peek( ));
        System.out.println("pop:" + stapel.pop( ));
        System.out.println(stapel.push("neu"));
        System.out.println(stapel.push("neuer"));
        System.out.println(stapel.push("Manuel Neuer"));

        // subList erstellt neue Liste anhand Index
        System.out.println(stapel.subList(0,5));


        // Beispiel Queue
        Queue<String> waitingList = new LinkedList<>( );
        waitingList.add("Alice");
        waitingList.add("Charlie");
        waitingList.add("Karl");
        System.out.println(waitingList.poll());


        // Beispiel Stack
        Stack<String> browserHistory = new Stack<>( );
        browserHistory.push("https://www.google.com");
        browserHistory.push("https://www.facebook.com");
        browserHistory.push("https://www.github.com");

        System.out.println("Current page: " + browserHistory.peek( ));
        browserHistory.pop( );
        System.out.println("Back to: " + browserHistory.peek( ));
    }
}