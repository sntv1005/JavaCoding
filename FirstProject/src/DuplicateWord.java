import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        
        String str = "This is a test. This test is just a test.";
        duplicateWord(str);
    }
    
    static void duplicateWord(String str){

        String input= str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String[] words =input.split("\\s+");
        System.out.println(word);

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
