package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concatanate {

    public static void main(String[] args) {
        
        List<String> list1= Arrays.asList("Srinath", "Alexa");
        List<String> list2= Arrays.asList("Sdkj", "bbc");

        Stream<String> concat= Stream.concat(list1.stream(), list2.stream());

        concat.forEach(System.out::print);
        
    }
    
}
