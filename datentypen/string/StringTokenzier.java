package de.basics.datentypen.string;

import java.util.StringTokenizer;

public class StringTokenzier {
    // W Ö R T E R  Z Ä H L E N

    public static void main(String[] args) {
        // Beispiel 1
        String exampleText = "Weit draußen in den unerforschten Einöden eines total " + "aus der Mode gekommenen Ausläufers des westlichen Spiralarms " + "der Galaxis leuchtet unbeachtet eine kleine gelbe Sonne." + " Um sie kreist in einer Entfernung von ungefähr auchtundneunzig " + "Millionen Meilen ein absolut unbedeutender, kleiner blaugrüner Planet, " + "dessen vom Affen stammende Bioformen so erstaunlich primitiv sind, " + "daß sie Digitaluhren noch immer für eine unwahrscheinlich tolle Erfindung halten.";

        StringTokenizer tokenizerText = new StringTokenizer(exampleText);

        int countWordsToken = tokenizerText.countTokens( );

        System.out.println(exampleText);
        System.out.println("Words count in this text: " + (countWordsToken));


        // Beispiel 2
        String withoutThis = " - ";
        String myString = "The  sky - - is blue!";
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        StringTokenizer stringTokenizer2 = new StringTokenizer(myString,withoutThis);

        int tokensCount1  = stringTokenizer1.countTokens();
        int tokensCount2  = stringTokenizer2.countTokens();

        System.out.println("Word count without delimiter: " + String.valueOf(tokensCount1));
        System.out.println("Word count: " + String.valueOf(tokensCount2));
    }
}