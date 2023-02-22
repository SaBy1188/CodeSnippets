package de.basics.enums.vergleich;

public class NoEnumClass {
    public static final NoEnumClass TEST1 = new NoEnumClass("A");
    public static final NoEnumClass TEST2 = new NoEnumClass("B");

    private String a;
    private NoEnumClass(String a) {
        this.a = a;
    }
}