package com.example.JavaCodingPractice.Stringss;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Srinatha v srinatha v srinatha is srinatha";
        reverseStringUsingForLoop(str);
        System.out.println();
        reverseStringUsingBuilder(str);
        reverseStringUsingStreams(str);
        reverseStringUsingStream(str);
    }

    private static void reverseStringUsingStream(String str) {

        String strr = Arrays.stream(str.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("reverse A String without disturbing order : " +strr);
    }

    private static void reverseStringUsingStreams(String str) {
        String reverse = str.chars()
                .mapToObj(element-> (char)  element)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return list.stream()
                                    .map(String :: valueOf)
                                    .collect(Collectors.joining());
                        }
                ));
        System.out.println("using streams : "+reverse);
    }

    private static void reverseStringUsingBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.print(sb);


    }

    private static void reverseStringUsingForLoop(String str) {
        for(int i=str.length()-1;i>=0;i--){
//            System.out.print("reverse of a string is : ");
            System.out.print(str.charAt(i));
        }
    }


}
