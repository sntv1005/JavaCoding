package JavaPro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddEven {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,1,1,1,2,2,2,23,3,3,3,4,5,6,7,85,6,7,8,9);

        List<Integer> even = list.stream().filter(e-> e%2==0).collect(Collectors.toList());
        System.out.println("Even numbers are : "+even);

        int[] arr= {2,1,6,9,2,4,6,8,0,4,5,10,12,19,14,12,15};

        List<Integer> odd = Arrays.stream(arr).boxed().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println("odd numbers are :"+odd);

        Integer max = list.stream().max(Integer::compare).get();
        System.out.println("max number is :" +max);

        Set<Integer> sort = Arrays.stream(arr).boxed().sorted().collect(Collectors.toSet());
        System.out.println("sorted list : "+sort);

        Set<Integer>set = new HashSet<>();
        Set<Integer> sets= Arrays.stream(arr).boxed().filter(e-> set.add(e)).collect(Collectors.toSet());
        System.out.println("without duplicates : "+sets);

        Map<Integer,Long> count = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("each element count : "+count);

        int maximum =list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maximum);

        List<Integer> ja= list.stream().filter(e-> e>20). map(i-> i*2).collect(Collectors.toList());

        System.out.println(ja);

        int total = list.stream().reduce((a,b)->a+b).get();
        System.out.println(total);

    }
}
