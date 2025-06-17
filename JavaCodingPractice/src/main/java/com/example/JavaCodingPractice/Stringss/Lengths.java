package com.example.JavaCodingPractice.Stringss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lengths {

    public static void main(String[] args) {

        String str = " I am Learning Java Streams";
        highestLenght(str);
        secondHighest(str);
        occurenceOfEachWord(str);
        vowels(str);
    }

    private static void vowels(String str) {
//        Arrays.stream(str.split(" ")).filter(x-> x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println());
    }

    private static void occurenceOfEachWord(String str) {
        Map<String,Long> map =  Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("occurence of each word is : " +map);
    }

    private static void secondHighest(String str) {
        String highest = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String:: length).reversed()).skip(1).findFirst().get();
        System.out.println("second highest is :"+highest);
    }

    private static void highestLenght(String str) {
        String highest = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println("highest length word is : "+highest);
    }
}
