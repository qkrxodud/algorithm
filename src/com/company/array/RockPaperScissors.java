package com.company.array;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String [] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] numbersA = rockPaperScissors.initData(in, count);
        int [] numbersB = rockPaperScissors.initData(in, count);

        rockPaperScissors.solution(numbersA, numbersB, count);
    }

    int[] initData(Scanner in, int count) {
        int [] numbers = new int[count];

        for (int i=0; i<count; i++) {
            numbers[i] = in.nextInt();
        }
        return numbers;
    }

    void solution(int [] numbersA, int [] numbersB, int count) {
        char result;
        for (int i = 0; i < count; i++) {
            if (numbersA[i] == numbersB[i]) {
                result = 'D';
            } else if (numbersA[i] == 1 && numbersB[i] == 2) {
                result = 'B';

            } else if (numbersA[i] == 2 && numbersB[i] == 3) {
                result = 'B';

            } else if (numbersA[i] == 3 && numbersB[i] == 1) {
                result = 'B';
            } else {
                result = 'A';
            }
            System.out.println(result);
        }
    }
}
