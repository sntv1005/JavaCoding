package Streams;

import java.util.Arrays;

public class StartsWithOne {

    public static void main(String[] args) {
        
        int[] arr= {1,2,3,4,5,6,7,11,123,234,2333,234};

        Arrays.stream(arr).boxed().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);
    }
    
}
