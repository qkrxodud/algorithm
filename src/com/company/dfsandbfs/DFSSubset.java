package com.company.dfsandbfs;

import java.util.Scanner;

public class DFSSubset {
    static String answer = "NO";
    static int [] arr;
    static int count, total = 0;

    public static void main(String[] args) {
        DFSSubset dfsSubset = new DFSSubset();
        Scanner in = new Scanner(System.in);
        count = in.nextInt();

        arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        dfsSubset.solution();
    }
    void solution() {
        DFS(0, 0);
        System.out.println(answer);
    }

    void DFS(int L, int sum) {
        if (count == L) {
            if ((total - sum) == sum) {
                answer = "YES";
                return;
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

}
