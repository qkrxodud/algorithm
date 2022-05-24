package com.company.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public static void main(String [] args) {
        ClassPresident classPresident = new ClassPresident();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String str = "";
        str = in.next();
        classPresident.solution(count, str);
    }

    void solution(int count, String str) {
        int max = Integer.MIN_VALUE;
        char leader = 'N';
        char [] arr = str.toCharArray();

        HashMap<Character, Integer> vote = new HashMap<>();
        for (char c : arr) {
            vote.put(c, vote.getOrDefault(c, 0)+1);
        }

        for (Character character : vote.keySet()) {
            int value = vote.get(character);
            if (max<value) {
                leader = character;
                max = value;
            }
        }
        System.out.println(leader);
    }
}
