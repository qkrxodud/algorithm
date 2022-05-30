package com.company.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class Stall {
    public static void main (String [] args) {
        Stall stall = new Stall();
        Scanner in = new Scanner(System.in);
        int arrCount = in.nextInt();
        int horseCount = in.nextInt();
        int [] arr = new int[arrCount];

        for (int i = 0; i < arrCount; i++) {
            arr[i] = in.nextInt();
        }
        stall.solution(arrCount, horseCount, arr);
    }


    void solution(int arrCount, int horseCount, int [] arr) {
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[arrCount-1];
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            // 중요 포인트!!!
            int count = calc(arr, mid);
            if(count >= horseCount) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        System.out.println(answer);

    }

    int calc(int [] arr, int distance) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - ep) >= distance) {
                cnt ++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
