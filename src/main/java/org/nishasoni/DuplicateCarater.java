package org.nishasoni;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCarater {
    public static void main(String[] args) {
        String input = "JAVA DEVELOPERS";

        Map<Integer, Long> charFrequencyMap = input.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charFrequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println((char) entry.getKey().intValue() + " occurs " + entry.getValue() + " times."));
    }
}
