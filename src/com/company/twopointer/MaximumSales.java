package com.company.twopointer;

import java.util.Scanner;

public class MaximumSales {
    public static void main(String [] args) {
        MaximumSales maximumSales = new MaximumSales();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int k = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }
        maximumSales.solution(count, k, arr);
    }

    void solution(int count, int k, int [] arr) {
        int lt = 0;
        int kCount = 0;
        int answer = 0;

        for (int rt = 0; rt<count; rt++) {
            if (arr[rt] == 0) {
                kCount ++;
            }
            while (k < kCount) {
                if (arr[lt] == 0) {
                    kCount --;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        System.out.println(answer);
    }
}
