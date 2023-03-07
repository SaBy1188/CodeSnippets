package de.basics.z_stuff;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class AktuelleUhrzeit {
    public static void main(String[] args) {
        // T I M E  &  D A T E
        OffsetTime todayTime = OffsetTime.now();
        OffsetDateTime todayDate = OffsetDateTime.now();
        System.out.println(todayTime);
        System.out.println(todayDate);


        // S P E C I F I C  T I M E
        /**Programm zur Anzeige, ob es Tag oder Nacht ist.*/
        OffsetTime daytime = OffsetTime.now();

        byte istGeradeTag = (byte) daytime.get(ChronoField.HOUR_OF_DAY);
        if (istGeradeTag >= 7 && istGeradeTag <= 22) {
            System.out.println("Ja, gerade ist Tag.");
        } else {
            System.out.println("Nein, gerade ist Nacht.");
        }
    }
}