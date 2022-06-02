package com.company.dfsandbfs;

import java.util.Scanner;

public class DFSDogRide {
    static int weight = 0;
    static int [] arr;
    static int count, total = 0;
    static int maxTemp = 0;

    public static void main(String[] args) {
        DFSDogRide dfsDogRide = new DFSDogRide();
        Scanner in = new Scanner(System.in);
        weight = in.nextInt();
        count = in.nextInt();
        arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        dfsDogRide.solution();
    }
    void solution() {
        DFS(0, 0);
        System.out.println(maxTemp);
    }

    void DFS(int L, int sum) {
        if (L == count) {
            if (sum < weight && sum > maxTemp) {
                maxTemp = sum;
            }
        } else {
            DFS(L+1, sum + arr[L]);
            DFS(L+1, sum);
        }
    }
}
