package com.example.JavaCodingPractice.Stringss;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Valdiate {

    public static void main(String[] args) {

        String input = "{[(])}";
        System.out.println("Is Valid: " + isValid(input));
        System.out.println("Is Balanced: " + isBalanced(input));

    }

    private static boolean isValid(String input) {

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
