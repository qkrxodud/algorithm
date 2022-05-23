package com.company.string;

import java.util.Scanner;

public class RemoveDuplicateChar {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i) + "/" + str.indexOf(str.charAt(i)) +"/"+ i);
            if (isSameNumber(str.indexOf(str.charAt(i)), i)) {
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
        return answer;
    }

    private boolean isSameNumber(int n1, int n2) {
        boolean result = true;
        if (n1 != n2) {
            result = false;
        }
        return  result;
    }

    public static void main(String[] args) {
        RemoveDuplicateChar searchChar = new RemoveDuplicateChar();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        searchChar.solution(str);
    }
}
