package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class Cube {
    
    public static void main(String[] args) {
        
    
    int[] arr= { 1,2,3,4,5,6,7,8,9};

    List<Integer> list = Arrays.stream(arr).boxed().filter(i-> i>5).map(i-> i*i*i).collect(Collectors.toList());
    
    System.out.println(list);

    }
}
