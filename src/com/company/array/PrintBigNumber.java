package com.company.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNumber {

    public static void main(String [] ars) {
        PrintBigNumber printBigNumber = new PrintBigNumber();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        for (int number : printBigNumber.solution(numbers)) {
            System.out.print(number + " ");
        }
    }

    private ArrayList<Integer> solution(int [] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(numbers[0]);

        for (int i=1; i<numbers.length; i++) {
            if (numbers[i-1] < numbers[i]) {
                result.add(numbers[i]);
            }
        }
        return result;
    }
}
