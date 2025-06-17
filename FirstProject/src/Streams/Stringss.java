package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringss {
    
    public static void main(String[] args) {
        
        String str = " asrajsk ";


        // // str= str.replaceAll(" ", "");
        // str= str.trim();
        // List<Character> list = str.chars().mapToObj(element-> Character.toUpperCase((char) element)).collect(Collectors.toList());
        // System.out.println(list);

        str= str.trim();
        Map<Character, Long> map = str.chars().mapToObj(c-> Character.toLowerCase((char)c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        String str2 = " Ags agsj asgh asgaj asgah ashja word word ";
        String[] split = str2.split("//s+");

        Map<String, Long> maps= Arrays.stream(split).map(a->a.toLowerCase()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(maps);
        
    }
}
