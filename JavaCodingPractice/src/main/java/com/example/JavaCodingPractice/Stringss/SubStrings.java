package com.example.JavaCodingPractice.Stringss;

import java.util.HashSet;

public class SubStrings {
    public static void main(String[] args) {

        String str="srinatha";
        allPossibleSubStrings(str);
        System.out.println("Longest SubString is  :"+longestSubStringWithoutRepeatingCharacter(str));
    }

    private static String longestSubStringWithoutRepeatingCharacter(String str) {
        int start = 0, end = 0, maxLength = 0;
        String result = "";
        HashSet<Character> set = new HashSet<>();

        while (end < str.length()) {
            if (!set.contains(str.charAt(end))) {
                set.add(str.charAt(end++));
                if (end - start > maxLength) {
                    maxLength = end - start;
                    result = str.substring(start, end);
                }
            } else {
                set.remove(str.charAt(start++));
            }
        }
        return result;
    }

    private static void allPossibleSubStrings(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
