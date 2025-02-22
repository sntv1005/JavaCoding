import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfnaturalNumbers {
    
    public static void main(String[] args) {
        
       Integer sum = IntStream.range(0, 11).sum();
       System.out.println(sum);

       // reverse an array


       int[] arr= {1,2,3,4,5,6};

       int[] c= IntStream.rangeClosed(1, arr.length).map(i->arr.length-i).toArray();

       System.out.println(Arrays.toString(c));

       IntStream.rangeClosed(1, 10).filter(i-> i%2==0).forEach(System.out::println);
   
       // string starts with number

       List<String> list = Arrays.asList("1one", "2two","Three");
       list.stream().filter(e-> Character.isDigit(e.charAt(0))).forEach(System.out::println);
   
       //duplicate word

       List<String> lists= Arrays.asList("Sri","Ammu","Sri", "sri");

       Set <String> s  = new HashSet<>();
       
       lists.stream().map(String:: toLowerCase).filter(e-> !s.add(e)).collect(Collectors.toList());
   
      
   
   
   
    }
}
