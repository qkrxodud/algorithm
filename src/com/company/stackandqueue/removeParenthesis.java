package com.company.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class removeParenthesis {
    public static void main (String [] args) {
        removeParenthesis removeParenthesis = new removeParenthesis();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        removeParenthesis.solution(str);
    }

    void solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        char [] ar = str.toCharArray();
        for (char c : ar) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (Character character : stack) {
            answer += character;
        }
        System.out.println(answer);
    }
}
