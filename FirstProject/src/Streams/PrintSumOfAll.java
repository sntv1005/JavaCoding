package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintSumOfAll {
    
public static void main(String[] args) {
    
    int[] intt= {1,2,3,4,5,1,2,5,6,12,15,21,23,7,8,9};

    // Arrays.stream(intt)
    // .mapToObj(String::valueOf) // Convert int to String
    // .filter(e -> e.startsWith("1")) // Filter numbers starting with '1'
    // .forEach(System.out::println);

    Set<Integer> set = new HashSet<>();
    // Arrays.stream(intt).boxed().filter(e-> !set.add(e)).forEach(System.out::println);

    // Integer max = Arrays.stream(intt).boxed().max(Integer :: compare).get();
    // Integer min = Arrays.stream(intt).boxed().min(Comparator.comparing(Integer :: valueOf)).get();
    // System.out.println(max);
    // System.out.println(min);

    List<Integer> list = Arrays.stream(intt).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    // System.out.println(list);
    List<Integer> lists = Arrays.stream(intt).boxed().skip(5).reduce((a,b)-> a+b).get();
    System.out.println(lists);

}
}
    
