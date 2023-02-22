package de.basics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // R A N D O M  I N T
        Random randomNumber = new Random();
        int randomInteger = randomNumber.nextInt();

        System.out.println(randomInteger);


        // R A N D O M  O F  5  I N T S
        Random randomNumber5 = new Random();
        randomNumber5.ints().limit(5).forEach(System.out::println);


        // R A N D O M  S P E C T R U M
        Random randomNumber100 = new Random();
        randomNumber100.ints(0, 100).limit(1).forEach(System.out::println);
    }
}