package com.example.JavaCodingPractice.Stringss;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String str = "absabsnauwaba";
        mostFrequentCharacter(str);
    }

    private static void mostFrequentCharacter(String str) {
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<Character, Long>> maxEntry = freqMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            System.out.println("Most Frequent Character: " + maxEntry.get().getKey() +
                    " (occurred " + maxEntry.get().getValue() + " times)");
        } else {
            System.out.println("String is empty or no characters found.");
        }
    }
}
