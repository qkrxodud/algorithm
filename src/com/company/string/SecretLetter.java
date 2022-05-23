package com.company.string;

import java.util.Scanner;

public class SecretLetter {

    public String solution(int number, String str) {
        String answer = "";
        for (int i = 0; i < number; i++) {
            String temp = str.substring(0, 7);
            str = str.substring(7);

            int n = convertStringToNumber(temp);

            answer += (char)n;
        }
        return answer;
    }

    public int convertStringToNumber(String temp) {
        String str = temp.replace("#", "1").replace("*", "0");
        return Integer.parseInt(str, 2);
    }

    public static void main(String[] args) {
        SecretLetter secretLetter = new SecretLetter();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String str = in.next();

        System.out.println(secretLetter.solution(number, str));

    }
}
