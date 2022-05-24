package com.company.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaleType {
    public static void main(String [] args) {
        SaleType saleType = new SaleType();

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }

        saleType.solution(count, k, arr);
    }

    void solution(int count, int k, int [] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        for (int rt=k-1; rt<count; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.getOrDefault(arr[lt],0)-1);
            int getLtval = map.get(arr[lt]);
            if (getLtval == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        for (Integer integer : answer) {
            System.out.println(integer);

        }
    }
}
