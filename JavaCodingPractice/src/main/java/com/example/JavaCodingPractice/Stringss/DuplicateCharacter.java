package com.example.JavaCodingPractice.Stringss;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {


        String str = "amma";
        usingStreams(str);
        usingForLoop(str);
    }

    private static void usingForLoop(String str) {
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1; j<str.length();j++) {


                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("duplicate found at :" + str.charAt(i));
                    count++;
                    System.out.println(count);
                }
            }
        }
    }

    private static void usingStreams(String str) {
        str.chars().mapToObj(character-> (char) character)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >1)
                .forEach(entry -> System.out.println(entry.getKey() + " "));
    }
}
