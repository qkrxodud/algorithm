package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalCount {
    public static void main(String [] ars) {
        DecimalCount decimalCount = new DecimalCount();
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }
        decimalCount.solution(count, arr);
    }

    private void solution(int count, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            int temp = i;
            int res = 0;
            while (temp>0) {
                int t = temp%10;
                res = res*10 + t;
                temp = temp/10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        for (Integer integer : answer) {
            System.out.println(integer + " ");
        }
    }

    private boolean isPrime(int res) {
        if (res == 1) return false;
        for (int i=2; i<res; i++) {
            if (res%i == 0) {
                return false;
            }
        }
        return true;
    }
}