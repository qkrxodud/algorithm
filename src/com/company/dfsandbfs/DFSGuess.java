package com.company.dfsandbfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSGuess {

    static int n;
    static int m;
    static int firstN;
    static int [][] arr;
    static int [] ch;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        firstN = in.nextInt();
        arr = new int[1001][1001];
        ch = new int[1001];

        for (int i = 0 ; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr[x][y] = arr[y][x] = 1;
        }

        dfs(firstN);
        bfs(firstN);
    }

    public static void dfs(int i) {
        System.out.println(i);
        ch[i] = 1;
        for (int j = 1; j <= n; j++) {
            if (arr[i][j] == 1 && ch[j] == 0) {
                dfs(j);
            }
        }

    }

    public static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        ch[i] = 1;
        queue.offer(i);
        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int j = 1; j <= n; j++) {
                if (arr[x][j] == 1 && ch[j] == 0) {
                    queue.offer(j);
                    ch[x] = 1;
                    System.out.println(x);
                }
            }

        }
    }
}
