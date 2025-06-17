package com.example.JavaCodingPractice.Stringss;

public class DuplicateWord {

    public static void main(String[] args) {


        String str = "asdf asdf agbsg absgsn ";

        String[] split = str.split(" ");
        for (int i = 0; i <split.length;i++){
            for(int j=i;j<split.length-1;j++) {


                if ( (split[i]).equals(split[j])) {
                    System.out.println("duplicate word fount : " + split[i]);
                }
            }
        }
    }
}
