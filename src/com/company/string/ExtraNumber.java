package com.company.string;

import java.util.Scanner;

public class ExtraNumber {
    public int solution(String str) {
        int answer = 0;
        char [] chars = str.toCharArray();
        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                answer = answer*10+(c-48);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ExtraNumber extraNumber = new ExtraNumber();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(extraNumber.solution(str));

    }
}
