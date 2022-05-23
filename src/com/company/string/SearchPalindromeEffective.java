package com.company.string;

import java.util.Scanner;

public class SearchPalindromeEffective {
    public String solution(String str) {
        String answer = "NO";
        // 특수문자 삭제
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reversStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversStr)) {
            answer = "YES";
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        SearchPalindromeEffective searchChar = new SearchPalindromeEffective();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        searchChar.solution(str);
    }
}
