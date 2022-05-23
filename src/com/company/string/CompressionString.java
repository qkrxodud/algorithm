package com.company.string;

import java.util.Scanner;

public class CompressionString {
    public String solution(String str) {
        String answer = "";
        str += " ";
        char [] chars = str.toCharArray();
        int cnt = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (chars[i] == chars[i+1]) {
                cnt += 1;

            } else {
                answer += chars[i];
                if (cnt > 1) {
                    answer += cnt;
                }
                cnt = 1;
            }

        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        CompressionString compressionString = new CompressionString();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        compressionString.solution(str);

    }
}
