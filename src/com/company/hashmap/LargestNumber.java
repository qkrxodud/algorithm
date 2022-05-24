package com.company.hashmap;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LargestNumber {
    public static void main(String [] args) {
        LargestNumber largestNumber = new LargestNumber();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }

        largestNumber.solution(count, k, arr);
    }

    void solution(int count, int k, int [] arr) {
        int answer = -1;
        int numberCount = 0;
        TreeSet<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());
        for (int i=0; i<count; i++) {
            for (int j=i+1; j<count; j++) {
                for (int l=j+1; l<count; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        for (Integer integer : tSet) {
            numberCount++;
            if (numberCount == k) {
                answer = integer;
            }
        }
        System.out.println(answer);
    }
}
