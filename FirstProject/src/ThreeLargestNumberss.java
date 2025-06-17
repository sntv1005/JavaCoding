import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ThreeLargestNumberss {
    
    public static void main(String[] args) {
        
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,7,8);
       Set<Integer> set = new HashSet<>();

       list.stream().filter(e-> set.add(e)).sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
    //    set.addAll(list);
    //    System.out.println(set);

    String str = "Srinatha v";
    // str = str.replace(" ", "");
    str= str.trim();
    Map<Character,Long> mapp= str.chars().mapToObj(character-> Character.toLowerCase((char) character)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(str);
    System.out.println(mapp);
    // Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    // System.out.println(map);
    }
}
