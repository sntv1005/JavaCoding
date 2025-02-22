import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("null","Srinatha","sgaadhgsah","shsh");
        Optional<String> map  = list.stream().max(Comparator.comparingInt(String:: length));
        System.out.println(map);
    }
    
}
