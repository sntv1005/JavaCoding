package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


// Lambda expression helps us to write our code in functional style.
//  It provides a clear and concise way to implement 
//  SAM interface (Single Abstract Method) by using an expression.
//   It is very useful in collection library in which it helps to iterate, 
//   filter and extract data.
public class LambdaExpression {
    public static void main(String[] args) {
        
        List<String> Languages = Arrays.asList("Java","python","JavaAcript");
        System.out.println("languages starting with J :");
        filter(Languages, (str)->str.startsWith("J"));

    }

    public static void filter(List<String> names,  Predicate<String> condition ) {

        for(String name : names){
            if(condition.test(name)){
                System.out.println(name);
            }

        }
        
    }
}
