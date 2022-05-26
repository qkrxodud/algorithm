package com.company.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main (String [] args) {
        Postfix postfix = new Postfix();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        postfix.solution(str);

    }

    void solution(String str) {
        char [] arr = str.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : arr) {
            if ( Character.isDigit(c)) {
                stack.push((c - '0'));
                //숫자
            } else {
                //특수문자
                int rt = stack.pop();
                int lt = stack.pop();
                int calcResult = 0;
                switch (c) {
                    case '+' :
                        calcResult = lt+rt;
                        break;
                    case '-' :
                        calcResult = lt-rt;
                        break;
                    case '*' :
                        calcResult = lt*rt;
                        break;
                    case '/' :
                        calcResult = lt/rt;
                        break;
                }
                stack.push(calcResult);
            }
        }
        System.out.println(stack.get(0));
    }

}
