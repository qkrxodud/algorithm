package com.company.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class Mischief {
    public static void main(String [] args) {
        Mischief mischief = new Mischief();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        mischief.solution(count, arr);
    }

    void solution(int count, int [] arr) {
        int [] temp = arr.clone();
        Arrays.sort(arr);
        for (int i = 0; i < count; i++) {
            if(temp[i] != arr[i]) {
                System.out.print(i+1 + " ");
            }
        }


    }
}
