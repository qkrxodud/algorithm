package com.company.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {
    public static void main (String [] args) {
        CorrectParenthesis correctParenthesis = new CorrectParenthesis();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        correctParenthesis.solution(str);
    }

    boolean solution(String str) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char [] ar = str.toCharArray();
        for (char c : ar) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    answer = false;
                }
            }
        }
        if(!stack.isEmpty()) answer = false;
        System.out.println(answer);
        return answer;
    }
}
