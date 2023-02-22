package de.basics.datentypen.string;

import java.util.StringTokenizer;

public class StringLength {
    // W Ö R T E R  Z Ä H L E N

    public static void main(String[] args) {
        String exampleText =
                "Weit draußen in den unerforschten Einöden eines total "
                + "aus der Mode gekommenen Ausläufers des westlichen Spiralarms "
                + "der Galaxis leuchtet unbeachtet eine kleine gelbe Sonne."
                + " Um sie kreist in einer Entfernung von ungefähr auchtundneunzig "
                + "Millionen Meilen ein absolut unbedeutender, kleiner blaugrüner Planet, "
                + "dessen vom Affen stammende Bioformen so erstaunlich primitiv sind, "
                + "daß sie Digitaluhren noch immer für eine unwahrscheinlich tolle Erfindung halten.";


        int countWordsSplit = 1;

        for (int i = 0; i < exampleText.length() - 1; i++) {
            if ((exampleText.charAt(i) == ' ') && (exampleText.charAt(i + 1) != ' ')) {
                countWordsSplit++;
            }
        }
        System.out.println("Words count in this text: " + countWordsSplit);


        // Z E I C H E N  Z Ä H L E N
            // L E N G T H. M E T H O D E
        System.out.println("Numbers of Chars in this text: " + exampleText.length());
    }
}