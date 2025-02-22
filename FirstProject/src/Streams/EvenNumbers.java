package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
        
       List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8);

       List<Integer> lists= list.stream().filter(i->i%2==0).collect(Collectors.toList());
       System.out.println(lists);
       list.stream().filter(i->i%2!=0).forEach(System.out::print);
    }
}
