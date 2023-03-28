package de.basics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {

        Predicate<String> stringMatcher = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.startsWith("R")) {
                    return true;
                }
                return false;
            }
        };

        List<String> stringList = new ArrayList<>(Arrays.asList("R1", "E2", "R3", "F4"));
        System.out.println(stringList); // ["T1", "T2", "T3", "T4"]

        stringList = stringList.stream().filter((element) -> element.startsWith("R")).collect(Collectors.toList());
        System.out.println(stringList); // ["R1", "R3"]

        stringList = stringList.stream().sorted((e1, e2) -> {
            if (e1.contains("2")) {
                return 1;
            }
            if (e2.contains("2")) {
                return -1;
            }
            return 0;
        }).collect(Collectors.toList());

        Optional<String> optionalString = Optional.empty();
        String status = optionalString.orElse("Nicht verfügbar");

    }
}