package com.company.string;

import java.util.Scanner;

public class SearchChar {
    public String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for (String s1 : s) {
            int len = s1.length();
            if (len > min) {
                min = len;
                answer = s1;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        SearchChar searchChar = new SearchChar();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        searchChar.solution(str);

    }
}
