package com.company.array;

import java.util.Scanner;

public class SumGreatest {

    public static void main(String [] ars) {
        SumGreatest sumGreatest = new SumGreatest();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [][] arr = new int[count][count];
        for (int i=0; i< count; i++) {
            for (int j=0; j< count; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        sumGreatest.solution(count, arr);
    }

    private void solution(int count, int [][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i=0; i<count; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j=0; j<count; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i=0; i<count; i++) {
            sum1 += arr[i][i];
        }
        for (int i=0; i<count; i++) {
            sum2 += arr[i][count-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        System.out.println(answer);
    }

}
