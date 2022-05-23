package com.company.string;

import java.util.Scanner;

public class DistanceChar {
    public void solution(String str, char c) {
        int[] answer = new int[str.length()];
        char[] chars = str.toCharArray();

        int p = 1000;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        for (int i : answer) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        DistanceChar distanceChar = new DistanceChar();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        distanceChar.solution(str, c);
    }
}
