package com.company.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class IronRod {
    public static void main (String [] args) {
        IronRod ironRod = new IronRod();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ironRod.solution(str);
    }

    void solution(String str) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        char [] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else {
                stack.pop();
                if (arr[i-1] == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
                }

            }
        }
        System.out.println(answer);

    }
}
