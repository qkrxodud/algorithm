package com.company.twopointer;

import java.util.Scanner;

public class MaximumLine {
    public static void main(String [] args) {
        MaximumSales maximumSales = new MaximumSales();
        Scanner in = new Scanner(System.in);
        int maxDay = in.nextInt();
        int cnsctDays = in.nextInt();
        int [] sales = new int[maxDay];
        for (int i=0; i<maxDay; i++) {
            sales[i] = in.nextInt();
        }
        maximumSales.solution(maxDay, cnsctDays, sales);
    }

    void solution(int maxDay, int cnsctDays, int [] sales) {
        int sum = 0;
        int answer = 0;
        // 초기값
        for (int i=0; i<cnsctDays; i++) {
            sum += sales[i];
        }

        for (int i=cnsctDays; i<maxDay; i++) {
            sum = sum - sales[i-cnsctDays] + sales[i];
            answer = Math.max(answer, sum);
        }
    }
}
