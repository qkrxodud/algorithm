package com.company.twopointer;

import java.util.Scanner;

public class ContinuousSubsequence {
    public static void main(String [] args) {
        ContinuousSubsequence continuousSubsequence = new ContinuousSubsequence();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] numbers = new int[n];
        for (int i=0; i<n; i++) {
            numbers[i] = in.nextInt();
        }
        continuousSubsequence.solution(n, m, numbers);
    }

    void solution(int n, int m, int [] numbers) {
        int sum=0, lt=0;
        int count = 0;
        for (int rt=0; rt<n; rt++) {
           sum += numbers[rt];
           if (sum == m) {
               count++;
           }
           while (m<=sum) {
               sum -= numbers[lt];
               lt++;
               if (sum == m) {
                   count++;
               }
           }
        }
        System.out.println(count);
    }

}
