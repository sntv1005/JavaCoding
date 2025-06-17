package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        
        String str = " My zLife My Own Decisonshj jajcgjsac savvsahchs";

        Character ch = str.chars()
            .mapToObj(c -> Character.toLowerCase((char) c))
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() > 1L) // Change to == 1L for non-repeating
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);
        System.out.println(ch);
        
    }
    
}
