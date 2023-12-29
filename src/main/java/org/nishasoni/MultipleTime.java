package org.nishasoni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleTime {
    public static void main(String[] args) {
        String text = "This is a sample text. This text contains multiple occurrences text of some words.";

        Map<String, List<Integer>> wordPositions = findMultipleOccurrences(text);

        for (Map.Entry<String, List<Integer>> entry : wordPositions.entrySet()) {
            String word = entry.getKey();
            List<Integer> positions = entry.getValue();

            System.out.println("Word: " + word + ", Positions: " + positions);
        }
    }

    private static Map<String, List<Integer>> findMultipleOccurrences(String text) {
        Map<String, List<Integer>> wordPositions = new HashMap<>();
        String[] words = text.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase(); // Case insensitive comparison
            if (!wordPositions.containsKey(word)) {
                wordPositions.put(word, new ArrayList<>());
            }
            wordPositions.get(word).add(i + 1); // Add 1 to the position to make it 1-based
        }

        // Filter out words with only one occurrence
        wordPositions.entrySet().removeIf(entry -> entry.getValue().size() <= 1);

        return wordPositions;
    }
}
