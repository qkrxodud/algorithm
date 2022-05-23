package com.company.string;

import java.util.Scanner;

public class SearchPalindrome {
    public String solution(String str) {
        str = str.toLowerCase();
        String answer = "NO";
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversStr = stringBuilder.reverse().toString();
        if(str.equals(reversStr)) {
            answer = "YES";
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        SearchPalindrome searchChar = new SearchPalindrome();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        searchChar.solution(str);
    }
}
