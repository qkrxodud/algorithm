package com.company.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class SearchAllAnagram {
    public static void main(String [] args) {
        SearchAllAnagram searchAllAnagram = new SearchAllAnagram();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        searchAllAnagram.solution(str1, str2);
    }

    void solution(String str1 ,String str2) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        for (char c : arr2) {
            map2.put(c, map.getOrDefault(c, 0)+1);
        }

        for (int i=0; i<arr2.length-1; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }

        int lt = 0;
        for (int rt = arr2.length-1; rt<arr1.length; rt++) {
            map.put(arr1[rt], map.getOrDefault(arr1[rt], 0)+1);
            if (map.equals(map2)) {
                answer++;
            }
            map.put(arr1[lt], map.getOrDefault(arr1[lt], 0)-1);
            if (map.get(arr1[lt]) == 0) {
                map.remove(arr1[lt]);
            }
            lt++;
        }
        System.out.println(answer);
    }
}
