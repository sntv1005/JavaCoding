import java.util.Arrays;
import java.util.List;

public class Anagram {
    

    public static void main(String[] args) {
        
        int[] a= {1,2,3,4,5,6,7,8,9};
        int[] b = {1,2,442,23,13};

        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        double avg = Arrays.stream(a).average().getAsDouble();
        System.out.println(avg);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> list1= Arrays.asList(1,2,33,34,344,6,7,8);

        list.stream().filter(list1:: contains).forEach(System.out::println);



    }
}
