package com.company.sortingandsearching;

import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main (String [] args) {
        LeastRecentlyUsed leastRecentlyUsed = new LeastRecentlyUsed();
        Scanner in = new Scanner(System.in);

        int cashMemoryCount = in.nextInt();
        int [] cashMemory = new int[cashMemoryCount];

        int inputDataCount = in.nextInt();
        int [] inputData = new int[inputDataCount];

        for (int i=0; i<inputDataCount; i++) {
            inputData[i] = in.nextInt();
        }

        leastRecentlyUsed.solution(cashMemoryCount, cashMemory, inputDataCount, inputData);
    }

    void solution(int cashMemoryCount, int [] cashMemory, int inputDataCount, int [] inputData) {
        for (int i=0; i<inputDataCount; i++) {
            int pos = -1;
            for (int j=0; j<cashMemoryCount; j++) {
                if (inputData[i] == cashMemory[j]) pos = j;
            }

            if (pos == -1) {
                for(int j=cashMemoryCount-1; j>=1; j--) {
                    cashMemory[j] = cashMemory[j-1];
                }
                cashMemory[0] = inputData[i];
            } else {
                for(int j=pos; j>=1; j--) {
                    cashMemory[j] = cashMemory[j-1];
                }
                cashMemory[0] = inputData[i];
            }
        }
        for (int i1 : cashMemory) {
            System.out.println(i1);
        }

    }
}
