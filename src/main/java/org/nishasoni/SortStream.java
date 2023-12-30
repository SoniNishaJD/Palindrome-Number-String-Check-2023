package org.nishasoni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("banana", "apple", "orange", "grape", "pear");

        // Sort the list using the Stream API
        List<String> sortedList = stringList.stream()
                .sorted()
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Sorted List: " + sortedList);
    }
}
