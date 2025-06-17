package com.example.JavaCodingPractice.Numbers;

import java.util.Arrays;

public class SumOfNumber {
    public static void main(String[] args) {

        int num = 1223444;

        sumUsingStreams(num);
        sumUsingNormalMethod(num);

    }

    private static void sumUsingNormalMethod(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
    }

    private static void sumUsingStreams(int num) {

        System.out.println(String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .sum());

    }
}
