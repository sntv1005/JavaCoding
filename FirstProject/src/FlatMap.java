import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        
        List<Integer> odds= Arrays.asList(1,3,5,7,9);
        List<Integer> evens= Arrays.asList(2,4,6,8,10);
        List<Integer> prime= Arrays.asList(2,3,5,7,11);

        List<Integer> num =Stream.of(odds,evens,prime).flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(num);

        //  num.stream().distinct().forEach(n->System.out.print(n + " "));
         num.stream().distinct().sorted(Comparator.reverseOrder()).forEach(a->System.out.print(a +" "));
        Integer max=  num.stream().max(Integer::compareTo).get();
        System.out.println("The  maximum number is : " +max);

        Integer min =num.stream().min(Integer::compareTo).get();
        System.out.println("The minimum number is : " +min);
    }
    
}
