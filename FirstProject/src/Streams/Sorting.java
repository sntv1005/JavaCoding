package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Sorting {
    
    public static void main(String[] args) {
        

        int[] arr = { 1,2,3,6,90,9,0,12,34,52,12,34,56,78};
        Arrays.sort(arr);
        System.out.println(arr);

        Arrays.stream(arr).boxed().forEach(System.out::println);;
        // List<Integer> list = Arrays.asList(1,2,3,4,8,9,0,12,15,13,17,23,21,34,26,23);
        // Set<Integer>set = new HashSet<>();

        // list.stream().sorted().filter(a-> set.add(a)).forEach(System.out::println);
        // list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


        // System.out.println(LocalDate.now());
        // System.out.println(LocalDateTime.now());
        // Set<Integer> sets = new HashSet<>(list);

        // if(sets.size()== list.size()){
        //     System.out.println(" duplicate number is not there ");
        // } else {
        //     System.out.println("there");
        // }
    }
}
