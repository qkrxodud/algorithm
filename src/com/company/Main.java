package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String [] args) {
        Main main = new Main();
        String [] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(main.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++) {
                String temp = phone_book[i].substring(0, j);
                if (map.containsKey(temp))
                    return false;
            }
        return true;

    }


}
