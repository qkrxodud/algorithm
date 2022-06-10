package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static int[] numbers;
    static Integer [] numeberIntegers;

    public static void main(String[] args) {
        Main main = new Main();
        numbers = new int[]{10, 50, 100};

        numeberIntegers  = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numeberIntegers[i] = numbers[i];
        }
        main.solution();
    }

    public int solution() {
        int answer = 0;

        Arrays.sort(numeberIntegers, Collections.reverseOrder());

        for (int i = 0; i < numeberIntegers.length; i++) {
            System.out.println(numeberIntegers[i] +"/" + (i+1));
            if (numeberIntegers[i] <= i) {
                answer = i;
                break;
            }
            if (numeberIntegers.length-1 == i) {
                System.out.println(i);
                answer = i+1;
            }
        }

        return answer;

    }

}


