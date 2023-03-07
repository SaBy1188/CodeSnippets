package de.basics.collections.maps;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {
        HashMap<String, String> dictionaryDtoE = new HashMap<>(  );

        // Baum, Auto, Blume

        dictionaryDtoE.put("Baum","Tree");
        dictionaryDtoE.put("Auto","Car");
        dictionaryDtoE.put("Blume","Flower");

        dictionaryDtoE.put("Auto", "Vehicle");
        dictionaryDtoE.put("Pflanze", "Flower");

        System.out.println(dictionaryDtoE.containsKey("Baum") ? "Ja, Baum ist im Dictionary" : "Nein, Baum ist nicht im Dictionary");
        System.out.println(dictionaryDtoE.get("Auto"));
    }
}