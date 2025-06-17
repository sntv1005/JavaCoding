package com.example.JavaCodingPractice.Stringss;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctStrings {
        public static void main(String[] args) {

            // 1. Reverse a String
            String str = "Srinatha";
            System.out.println("1. Reversed String: " + new StringBuilder(str).reverse());

            // 2. Longest Substring without repeating characters
            System.out.println("2. Longest Unique Substring Length: " + longestUniqueSubstring(str));

            // 3. Remove duplicates from string
            System.out.println("3. String without duplicates: " + removeDuplicateChars(str));

            // 4. Substrings of a String
            System.out.println("4. Substrings of '" + str + "':");
            printAllSubstrings(str);

            // 5. Each Character Count
            System.out.println("5. Character Counts:");
            characterCount(str);

            // 6. Each Word Count
            String sentence = "Java is Java and Java is powerful";
            System.out.println("6. Word Counts:");
            wordCount(sentence);

            // 7. Reverse each word without changing order
            System.out.println("7. Reverse each word: " + reverseEachWord(sentence));

            // 8. Sort an Array
            int[] arr = {5, 3, 9, 1, 6};
            Arrays.sort(arr);
            System.out.println("8. Sorted Array: " + Arrays.toString(arr));

            // 9. Highest element in an array
            System.out.println("9. Highest: " + arr[arr.length - 1]);

            // 10. Second highest element
            System.out.println("10. Second Highest: " + arr[arr.length - 2]);

            // 11. Lowest element
            System.out.println("11. Lowest: " + arr[0]);

            // 12. Remove duplicates from array
            int[] withDupes = {3, 5, 3, 1, 5, 9};
            int[] noDupes = Arrays.stream(withDupes).distinct().toArray();
            System.out.println("12. Array without duplicates: " + Arrays.toString(noDupes));

            // 13. Missing elements from array 1-10
            int[] series = {1, 2, 4, 6, 7, 10};
            System.out.print("13. Missing numbers: ");
            findMissingNumbers(series, 1, 10);
        }

        // 2. Longest substring without repeating characters
        public static int longestUniqueSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int i = 0, j = 0, max = 0;
            while (j < s.length()) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    max = Math.max(max, j - i);
                } else {
                    set.remove(s.charAt(i++));
                }
            }
            return max;
        }

        // 3. Remove duplicate characters
        public static String removeDuplicateChars(String str) {
            StringBuilder sb = new StringBuilder();
            Set<Character> seen = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (seen.add(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        // 4. All substrings
        public static void printAllSubstrings(String str) {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j <= len; j++) {
                    System.out.println(str.substring(i, j));
                }
            }
        }

        // 5. Character count
        public static void characterCount(String str) {
            Map<Character, Long> freq = str.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            freq.forEach((k, v) -> System.out.println(k + ": " + v));
        }

        // 6. Word count
        public static void wordCount(String sentence) {
            Map<String, Long> freq = Arrays.stream(sentence.split(" "))
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

            freq.forEach((k, v) -> System.out.println(k + ": " + v));
        }

        // 7. Reverse each word
        public static String reverseEachWord(String sentence) {
            return Arrays.stream(sentence.split(" "))
                    .map(word -> new StringBuilder(word).reverse().toString())
                    .collect(Collectors.joining(" "));
        }

        // 13. Find missing numbers in range
        public static void findMissingNumbers(int[] arr, int start, int end) {
            Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
            for (int i = start; i <= end; i++) {
                if (!set.contains(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }










