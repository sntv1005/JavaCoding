import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Avergar {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        Double avg= list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
