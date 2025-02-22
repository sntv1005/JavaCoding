import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachString {

    public static void main(String[] args) {
        String str = "dgdg dgdgd sgdg sri sri ";

       // Split the string into words and count occurrences
        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+")) // Split by space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println(wordCount);
        // Print word count
        // wordCount.forEach((word, count) -> System.out.println(word + ": " + count));

    }
    
}
