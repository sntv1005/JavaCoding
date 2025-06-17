package Streams;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonrepetedCharacter {
    
    public static void main(String[] args) {
        
        String str= "My Life My Rules i am enjoying my life";

    Character res = str.chars()
    .mapToObj(c -> Character.toLowerCase((char) c))
    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    .entrySet()
    .stream()
    .filter(a -> a.getValue() == 1L)
    .map(Map.Entry::getKey) // Corrected to get the character
    .findFirst()
    .orElse(null); // Avoids NoSuchElementException

    System.out.println(res);


    Character ch= str.chars().mapToObj(element-> Character.toLowerCase((char) element))
    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    .entrySet().stream()
    .filter(element-> element.getValue()==1L)
    .map(Map.Entry:: getKey)
    .findFirst()
    .get();

    System.out.println(ch);
    }
}
