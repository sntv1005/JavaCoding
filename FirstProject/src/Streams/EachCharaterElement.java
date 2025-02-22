package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EachCharaterElement {

    public static void main(String[] args) {
        
        String str = "gsh sgsh aaha ajaja haja";

        String[] split= str.split("\\s+");
        // Map<String,Integer> map = new HashMap<>();
        // Map<Character, Long> map = str.chars().mapToObj(element-> Character.toLowerCase((char) element))
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Map<String,Long> maps= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // int count=0;
        // for(int i=0; i<str.length();i++){
        //     if(map.containsKey(split[i])){

        //        count=  map.get(split[i]);
        //        map.put(split[i], count);
        //     }
        // }
        // System.out.println(map);
        // System.out.println(maps);


        int[] array= {1,2,3,4,5,6,7,8};

        // Arrays.stream(array).filter(a->a%2!=0).forEach(System.out::println);


        int vowels = 0, consonants = 0;
        char[] chh= str.toLowerCase().toCharArray();

        for(char ch : chh){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) !=-1){
                    vowels ++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
    
}
