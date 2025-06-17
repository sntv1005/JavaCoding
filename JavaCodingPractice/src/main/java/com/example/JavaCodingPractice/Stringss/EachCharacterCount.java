package com.example.JavaCodingPractice.Stringss;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacterCount {
    public static void main(String[] args) {
        String str = "Srinatha v";
        eachCharacterCountUsingForLoop(str);
        eachCharacterCountUsingStres(str);

    }

    private static void eachCharacterCountUsingStres(String str) {
        Map<Character, Long> map = str.replaceAll(" ","").chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("each charcater count using streams : "+map);
    }

    private static void eachCharacterCountUsingForLoop(String str) {

        str= str.replaceAll(" ","");
        Map<Character,Long> map = new HashMap<Character, Long>();
        Long count =0L;

        for(int i=0; i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i),1L);
            }
        }
        System.out.println("Each Character Count using for loop : " +map);

    }
}
