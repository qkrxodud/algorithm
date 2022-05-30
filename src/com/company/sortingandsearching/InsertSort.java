package com.company.sortingandsearching;

import java.util.Scanner;

public class InsertSort {
    public static void main (String [] args) {
        InsertSort insertSort = new InsertSort();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }

        insertSort.solution(count, arr);
    }

    void solution(int count, int [] arr) {
        for (int i=1; i<count; i++) {
            int temp = arr[i],j;
            for (j=i-1; j>=0; j--) {
                if (temp < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
             arr[j+1] = temp;
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }

}
