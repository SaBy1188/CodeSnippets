package de.basics.kontrollstrukturen;

public class forEachLoop {
public static void main(String[] args) {
    String[] names = {"eins", "zwei", "drei"};

    for(int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
    }

    // name = Kopie von names
    for(String name : names) {
        System.out.println(name);
    }
}
}