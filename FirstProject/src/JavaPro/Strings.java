package JavaPro;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {
    
    public static void main(String[] args) {
        
        String str = "Srinatha v gsHGDSA BHSXSAHX HASHag xxvhsax XSAHX";
        // str= str.replace(" ", "");
        Map<Character,Long> eachCount= str.chars().mapToObj(character-> Character.toLowerCase((char) character))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(eachCount);

        Map<String, Long > eachWord= Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(eachWord);

        

    }
}
