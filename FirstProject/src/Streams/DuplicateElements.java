package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,4,6,7,9);
        Set<Integer> set = new HashSet<>(); 

        list.stream().filter(a-> !set.add(a)).forEach(System.out::println);
    }
}
