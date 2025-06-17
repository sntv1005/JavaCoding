package com.example.JavaCodingPractice.StringsPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stringss {

    public static void main(String[] args) {

        String str2 = "silent";
        String str3 = "listen";
        String str = " India is My Country";
        String str1 = "madam";
        //Reverse A String
        reverseStringUsingForLoops(str);
        reverseStringUsingStreams(str);
        reverseStringWithoutDisturbingOrder(str);

        // Palindrome
        palindromeUSingLoops(str1);
        palindromeUsingStreams(str1);

        //Remove Duplicates
        removeDuplicatesUsingLoops(str);
        removeDuplicatesUsingStreas(str);

        //Character Count
        occurenceOfEachCharacterUsingLoops(str);
        occurenceOfEachCharacterUsingStreams(str);


        // Word Count
        occurenceOfEachWordUsingLoops(str);
        occurenceOfEachWordUsingStreams(str);

        //First Non Repeating Character
        firstNonRepeatingCharacterUsingLoops(str);
        firstNonRepeatingCharacterUsingStreams(str);

        // Anagram
        anagram(str2,str3);

        // Longest Substrings without repeats
        longestSubStringUsingLoops(str2);
        longestSubstringUsingStreams(str2);

        // all substrings
        substrings(str2);


    }

    private static void substrings(String str2) {
        int count =0;
        for(int i=0; i<str2.length();i++){
            for(int j=i+1; j<str2.length();j++){
                System.out.println(" substrings : " + str2.substring(i,j));
                count++;
            }
        }
        System.out.println("count is : " +count);
    }

    private static void longestSubstringUsingStreams(String str2) {
    }

    private static void longestSubStringUsingLoops(String str) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLength = 0;
        int start = 0; // to remember the start index of max substring

        while (j < str.length()) {
            char ch = str.charAt(j);
            if (!set.contains(ch)) {
                set.add(ch);
                if (set.size() > maxLength) {
                    maxLength = set.size();
                    start = i; // update start of longest substring
                }
                j++;
            } else {
                set.remove(str.charAt(i++));
            }
        }

        String longestSubstring = str.substring(start, start + maxLength);
        System.out.println("Longest Substring Without Repeating Characters: \"" + longestSubstring + "\" with length: " + maxLength);
    }


    private static void anagram(String str2, String str3) {

        char ch[] = str2.toLowerCase().replaceAll(" ", "").toCharArray();
        char ch1[] = str3.toLowerCase().replaceAll(" ", "").toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        Boolean result = Arrays.equals(ch, ch1);
        if(result == true ){
            System.out.println(" its an anagram ");
        } else {
             System.out.println(" its not an anagram ");
        }

    }

    private static void firstNonRepeatingCharacterUsingStreams(String str) {

        Optional<Character> result = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("First non-repeating character: " + result.get());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static void firstNonRepeatingCharacterUsingLoops(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character is: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }

    private static void occurenceOfEachWordUsingStreams(String str) {
        Map<String, Long> wordCount =  Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(word-> word, Collectors.counting()));
        System.out.println(" occurenceOfEachWordUsingStreams " +wordCount);
    }

    private static void occurenceOfEachWordUsingLoops(String str) {

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split(" ");
        int count =0;


        for(int i=0; i < words.length;i++){
            if(wordCount.containsKey(words[i])){
                wordCount.put(words[i], wordCount.get(words[i])+1);
            } else {
                wordCount.put(words[i], 1);
            }
        }

        System.out.println(" occurenceOfEachWordUsingLoops : " +wordCount);

        for( String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);

        }
        System.out.println(" occurenceOfEachWordUsingLoops : " +wordCount);


    }

    private static void occurenceOfEachCharacterUsingStreams(String str) {

        Map<Character,Long> characterCount = str.replaceAll(" ", "").chars()
                .mapToObj( ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("occurenceOfEachCharacterUsingStreams" +characterCount);
//        characterCount.forEach((k,v)-> System.out.println(" Chatacters are : "+k+ " count is : " +v));
    }

    private static void occurenceOfEachCharacterUsingLoops(String str) {

        Map<Character,Integer> characterCount = new HashMap<>();

        for( char ch : str.toCharArray()){
            characterCount.put(ch, characterCount.getOrDefault(ch, 0)+1);
        }
        System.out.println(" occurenceOfEachCharacterUsingLoops : " +characterCount );
    }

    private static void removeDuplicatesUsingStreas(String str) {

        String str1 = str.chars()
                .distinct()
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining(" "));
        System.out.println("removeDuplicatesUsingStreas : "+str1);
    }

    private static void removeDuplicatesUsingLoops(String str) {

        Set<Character> set = new HashSet<>();

        for( char ch : str.toCharArray()){
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();

        for( char ch : set){
            sb.append(ch);
        }
        System.out.println(" removeDuplicatesUsingLoops : " +sb);
    }

    private static void palindromeUSingLoops(String str) {
        String reverse = "";
        for (int i= str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("reverse of a String is : "+reverse);

        if(reverse.equals(str)){
            System.out.println("it is palindrome");
        } else {
            System.out.println("not a palindrome ");
        }
    }

    private static void palindromeUsingStreams(String str) {
        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static void reverseStringWithoutDisturbingOrder(String str) {

        String reverse = Arrays.stream(str.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("reverseStringWithoutDisturbingOrder : " +reverse);
    }

    private static void reverseStringUsingForLoops(String str) {

        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
//            System.out.print("reverse string is using loops : ");
//            System.out.print( str.charAt(i));
            sb.append(str.charAt(i));
        }
        System.out.println("reverse string is using loops :"+sb);
    }

    private static void reverseStringUsingStreams(String str) {

        String reverse = IntStream.range(0, str.length())
                .mapToObj(i-> str.charAt(str.length()-i-1))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("reversed a string using streams : " + reverse);



    }
}
