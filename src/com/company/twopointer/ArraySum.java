package com.company.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
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
        arraySum.solution(array1Count, array2Count, array1, array2);
    }

    void solution(int array1Count, int array2Count, int [] array1, int [] array2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1<array1Count && p2<array2Count) {
            if (array1[p1] < array2[p2]) {
                answer.add(array1[p1]);
                p1++;
            } else {
                answer.add(array2[p2]);
                p2++;
            }
        }

        while(p1<array1Count) {
            answer.add(array1[p1]);
            p1++;
        }

        while(p2<array2Count) {
            answer.add(array2[p2]);
            p2++;
        }

        for (Integer integer : answer) {
            System.out.print(integer+" ");
        }

    }
}
