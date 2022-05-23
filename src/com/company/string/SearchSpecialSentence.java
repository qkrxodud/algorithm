package com.company.string;

import java.util.Scanner;

public class SearchSpecialSentence {
    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length -1;

        while(lt<rt) {
            if (!isAlpha(s[lt])) {
                lt++;
            } else if (!isAlpha(s[rt])) {
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        System.out.println(answer);
        return answer;
    }

    private boolean isAlpha(char c) {
        boolean result = true;
        if (!Character.isAlphabetic(c)) {
            result = false;
        }
        return  result;
    }

    public static void main(String[] args) {
        SearchSpecialSentence searchChar = new SearchSpecialSentence();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        searchChar.solution(str);

    }
}
