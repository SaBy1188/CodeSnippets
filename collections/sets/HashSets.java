package de.basics.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> berufe = new HashSet<>();
        berufe.add("Grafiker");
        berufe.add("Politikerin");
        berufe.add("Controllerin");
        berufe.add("Chemikerin");

        Set<String> neueBerufe = new HashSet<>();
        neueBerufe.add("Designer");
        neueBerufe.add("Ärztin");
        neueBerufe.add("Politikerin");
        neueBerufe.add("Chemikerin");

        // Vereinigung (alle ohne Doppelung)
        Set<String> vereinigung = new HashSet<>();
        vereinigung.addAll(berufe);
        vereinigung.addAll(neueBerufe);
        System.out.println(vereinigung);

        // Schnittmenge (in beiden enthalten)
        Set<String> schnittmenge = new HashSet<>();
        schnittmenge.addAll(berufe);
        schnittmenge.retainAll(neueBerufe);
        System.out.println(schnittmenge);

        // Differenzmenge (nur nicht doppelte)
        Set<String> differenz = new HashSet<>();
        differenz.addAll(berufe);
        differenz.removeAll(neueBerufe);
        System.out.println(differenz);

        // Untermenge (alle Elemente in einer anderen vorhanden)
        System.out.println(berufe.containsAll(neueBerufe));
    }
}