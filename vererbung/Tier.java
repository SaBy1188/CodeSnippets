package de.basics.vererbung;
// Superklasse, Elternklasse
// von dieser Klasse wird geerbt

public class Tier {
    public String name;
    public int    alter;
    public String laut;


    // Methode
    public void schlafen( ) {
        System.out.println("schläft");
    }


    // Getter Setter
    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter( ) {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getLaut( ) {
        return laut;
    }

    public void setLaut(String laut) {
        this.laut = laut;
    }
}