package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReference {
/* Java 8 Method reference is used to refer method of functional interface.
 It is compact and easy form of lambda expression. 
 Each time when you are using lambda expression to just referring a method,
 we can replace our lambda expression with method reference. */
    
     public static void main(String[] args) {
    
       List<String> words = Arrays.asList("Java", "Stream", "Method", "References");  
       List<String> upperCaseWords= words.stream().map(String::toUpperCase).collect(Collectors.toList());

       System.out.println("Uppercase Words: " + upperCaseWords);  

         // Instance Method Reference of an Arbitrary Object of a Particular Type  
         System.out.println("Printing each word:");  
         words.forEach(System.out::println); // instance method reference  
}
}
