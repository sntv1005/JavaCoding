import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatArrays {
    
    public static void main(String[] args) {
        
        int[] a= {1,2,3,4,5,6,7};
        int[] b = {11,1,2,4,5,6};

        int[] c= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
