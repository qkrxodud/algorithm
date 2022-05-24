package com.company.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
    public static void main(String [] args) {
        FindCommonElements findCommonElements = new FindCommonElements();
        Scanner in = new Scanner(System.in);
        int array1Count = in.nextInt();
        int [] array1 = new int[array1Count];
        for (int i=0; i<array1Count; i++) {
            array1[i] = in.nextInt();
        }
        int array2Count = in.nextInt();
        int [] array2 = new int[array2Count];
        for (int i=0; i<array2Count; i++) {
            array2[i] = in.nextInt();
        }

        findCommonElements.solution(array1Count, array2Count, array1, array2);
    }

    void solution(int array1Count, int array2Count, int [] array1, int [] array2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(array1);
        Arrays.sort(array2);

        while(p1 < array1Count && p2 < array2Count) {
            if (array1[p1] == array2[p2]) {
                answer.add(array1[p1]);
                p1++;
                p2++;
            } else if (array1[p1] < array2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }
}
