package de.basics.gettersetter;

public class GetterSetter {
    private String color;
    String c;

    // Getter
    // Datentyp muss ausgewählt werden
    // return Variable
    public String getColor() {
        return color;
    }

    // Setter
    // void = benötigt keinen Rückgabewert
    // Parameter: Was soll abgeändert werden?
    // this bezieht sich auf Hauptklasse Zeile 4
    public void setColor(String c) {
        this.color = c;
    }
}