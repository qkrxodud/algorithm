package com.company.twopointer;

import java.util.Scanner;

public class SumConsecutiveNumbers {
    public static void main(String [] args) {
        SumConsecutiveNumbers sumConsecutiveNumbers = new SumConsecutiveNumbers();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mok = n/2;
        int mod = n%2;
        int arrCount = mok+mod;
        int [] numbers = new int[arrCount];
        for (int i=0; i<arrCount; i++) {
            numbers[i] = i;
        }
        sumConsecutiveNumbers.solution(n, numbers, arrCount);
    }

    void solution(int n, int [] numbers,int count) {
        int sum = 0, lt = 0, answer = 0;

        for (int rt=0; rt<count; rt++)  {
            sum += numbers[rt];
            if (sum == n) {
                answer ++;
            }
            while (n<=sum) {
                sum -= numbers[lt];
                lt++;
                if (sum == n) {
                    answer ++;
                }
            }
        }
        System.out.println(answer);

    }
}
