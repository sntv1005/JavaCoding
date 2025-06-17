package com.example.JavaCodingPractice.Stringss;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachWordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String : ");
        String input = sc.nextLine();
        System.out.println("provided string is : " + input);
        String[] split = input.split(" ");
        eachWordCountUsingForLoo(split);
        eachWordCountUsingStream(split);


    }

    private static void eachWordCountUsingStream(String[] split) {
       Map<String,Long> eachwordCount =  Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println("each word count using streams is : "+eachwordCount);
    }

    private static void eachWordCountUsingForLoo(String[] split) {
            Map<String,Long> map = new HashMap<>();
            for (int i=0; i<split.length;i++){
                if(map.containsKey(split[i])){
                    map.put(split[i], map.get(split[i])+1L);
                } else {
                    map.put(split[i], 1L);
                }
            }

            System.out.println("each word count using for loop: "+map);
        }
        }


