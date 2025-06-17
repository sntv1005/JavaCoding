package com.example.JavaCodingPractice.Stringss;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String str = "hghjha";
        String str1= "Listen";
        boolean anagram = isAnagram(str,str1);
        if(anagram == true){
            System.out.println("its an anagram");
        }else {
            System.out.println("its not an anagram");
        }
    }

    private static boolean isAnagram(String str, String str1) {
        str= str.toLowerCase();
        str1=str1.toLowerCase();
        char[] ch = str.toCharArray();
        char[] ch1= str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch, ch1)){
            return true;
        }
        return false;
    }
}
