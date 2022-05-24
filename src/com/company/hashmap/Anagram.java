package com.company.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String [] args) {
        Anagram anagram = new Anagram();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        anagram.solution(str1, str2);
    }

    void solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        String result = "YES";

        char[] arr1 = str1.toCharArray();

        for (char c : arr1) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        char[] arr2 = str2.toCharArray();
        for (char c : arr2) {
            map.put(c, map.get(c)-1);
        }

        for (Character character : map.keySet()) {
            if(map.get(character) != 0) {
                result = "NO";
            }
        }
        System.out.println(result);
    }
}

