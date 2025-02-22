package Streams;

import java.util.Arrays;

public class FindFirstElement {
    
    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,8,8,9};
        Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::println);
        Long count = Arrays.stream(arr).boxed().count();
        System.out.println(count);

       int max =  Arrays.stream(arr).boxed().max(Integer:: compare).get();
       System.out.println(max);

       int min = Arrays.stream(arr).boxed().min(Integer::compare).get();
       System.out.println(min);
    }
}
