package com.company.array;

import java.util.Scanner;

public class SeeStudents {
    public static void main(String [] ars) {
        SeeStudents seeStudents = new SeeStudents();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        seeStudents.solution(numbers);
    }

    private void solution(int [] numbers) {
        int count = 0;
        int temp = 0;
        for (int number : numbers) {
            if (temp < number) {
                temp = number;
                count ++;
            }
        }
        System.out.println(count);
    }
}
