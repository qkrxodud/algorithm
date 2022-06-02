package com.company.dfsandbfs;

import java.util.Scanner;

public class DFSExchangeCoin {
    static int count = 0;
    static int [] arr;
    static int diff = 0;

    public static void main(String [] args) {
        DFSExchangeCoin dfsExchangeCoin = new DFSExchangeCoin();
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        diff = in.nextInt();
        dfsExchangeCoin.solution();
    }

    void solution() {
        DFS(0, 0);
    }

    void DFS(int L, int sum) {
        if (count == L) {
            if (sum == diff) {
                System.out.println(L);
            }
        } else {
            for (int i = 0; i < count; i++) {
                DFS(L+1, sum + arr[i]);
            }
        }

    }
}
