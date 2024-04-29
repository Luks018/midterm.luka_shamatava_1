package midterm.luka_shamatava_1.task4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Step 1: Create a set of all different words
        Set<String> wordSet = new HashSet<>(fantasyFormatData);

        // Step 2: Print the set on the console and copy it to the text file
        System.out.println("Set of different words:");
        wordSet.forEach(System.out::println);
        writeToTextFile("task4.txt", "Set of different words:", wordSet);

        // Step 3: Create a map for word length counts
        Map<Integer, Integer> lengthCountMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
        }

        // Step 4: Print the map on the console
        System.out.println("\nMap of word lengths and their counts:");
        lengthCountMap.forEach((length, count) -> System.out.println(length + ": " + count));
        writeToTextFile("task4.txt", "\nMap of word lengths and their counts:", lengthCountMap);
    }

    // Method to append output to a text file
    private static void writeToTextFile(String fileName, String header, Object data) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append("\n\n").append(header).append("\n");
            writer.append(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
