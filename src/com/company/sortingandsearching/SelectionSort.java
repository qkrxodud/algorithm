package com.company.sortingandsearching;

import java.util.Scanner;

public class SelectionSort {
    public static void main (String [] args) {
        SelectionSort selectionSort = new SelectionSort();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] arr = new int[count];
        for (int i=0; i<count; i++) {
            arr[i] = in.nextInt();
        }

        selectionSort.solution(count, arr);
    }

    void solution(int count, int [] arr) {
        int temp;

        for (int i=0; i<count; i++) {
            int index = i;
            for (int j=i+1; j<count; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
