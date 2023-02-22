package de.basics.oop;

public class Bauplan {
    // Eigenschaften anlegen (Attribute)
    // Funktionalität festlegen (Methoden)
    // Blaupause erstellen (Konstruktor)
    // Lese- und Schreibrechte (Getter & Setter)
    // String Leseausgabe (toString)


    // Attribute / Eigenschaften
    private String  attribut1 = "";
    private int     attribut2 = 0;
    private boolean attribut3;


    // Methode / Funktion
    public void methode( ) {
        System.out.println("Buh");
    }


    // Konstruktor
    public Bauplan(String attribut1,int attribut2,boolean attribut3) {
        this.attribut1 = attribut1;
        this.attribut2 = attribut2;
        this.attribut3 = attribut3;
    }


    // Getter & Setter
    public String getAttribut1( ) {
        return attribut1;
    }

    public void setAttribut1(String attribut1) {
        this.attribut1 = attribut1;
    }

    public int getAttribut2( ) {
        return attribut2;
    }

    public void setAttribut2(int attribut2) {
        this.attribut2 = attribut2;
    }

    public boolean isAttribut3( ) {
        return attribut3;
    }

    public void setAttribut3(boolean attribut3) {
        this.attribut3 = attribut3;
    }


    // toString

    @Override
    public String toString( ) {
        return "Bauplan{" + "attribut1='" + attribut1 + '\'' + ", attribut2=" + attribut2 + ", attribut3=" + attribut3 + '}';
    }
}