import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStratsAndEndsWith {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("javj","asaf","sgsh","shsj","Ajaja");

List<String> sameStartEnd = list.stream()
                .filter(s -> s.length() > 1 && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length() - 1)))
                .collect(Collectors.toList());   
            
            String str = "sgs sgdh sjssi ddhdj";

           String lit = Arrays.stream(str.split("\\s+")).map(e-> new StringBuffer(e).reverse()).collect(Collectors.joining(" "));
        
           System.out.println(lit);
        }
}
