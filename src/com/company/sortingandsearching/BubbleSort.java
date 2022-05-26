package com.company.sortingandsearching;

import java.util.Scanner;

public class BubbleSort {
    public static void main (String [] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }

        bubbleSort.solution(count, arr);
    }

    void solution(int count, int [] arr) {
        for (int i=0; i<count-1; i++) {
            for (int j=0; j<count-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
