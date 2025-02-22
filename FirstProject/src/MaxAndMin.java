import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        
        List<Integer> list  =Arrays.asList(1,2,3,4,5,6,7,8);

        int max  =list.stream().max(Integer::compare).get();
        // System.out.println(max);

        list.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
    }
}
