package com.company.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args) {
        BinarySearch binarySearch = new BinarySearch();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int value = in.nextInt();
        int [] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        binarySearch.solution(count, value, arr);
    }

    void solution(int count, int value, int [] arr) {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int answer = 0;
        int lt = 0;
        int rt = count-1;

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (arr[mid] == value) {
                answer=mid+1;
                break;
            }
            if (arr[mid] > value) rt = mid -1;
            else lt = mid + 1;
        }
        System.out.println(answer+1);
    }
}
