package com.company;

import java.util.*;

public class Main {

    static int [][] arr;
    static int[] checked; //확인 여부

    public static void main(String [] args) {
        Main main = new Main();
        int n = 6;
        int [][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(main.solution(n, edge));
    }

    public int solution(int n, int[][] edge) {
        arr = new int [n+1][n+1];
        checked = new int [n+1];

        for (int i = 0; i <= n; i++) {
            arr[edge[i][0]][edge[i][1]] = 1;
            arr[edge[i][1]][edge[i][0]] = 1;
        }
        return BFS( 1, n);
    }

   public static int BFS( int start, int n) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(start);
        checked[start] = 1;

        int L = 1 ;
        int levelMax = 0;
        int answer = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++){
                int cur = Q.poll();
                for (int j = 1; j <=n; j++) {
                    if (arr[cur][j] == 1 && checked[j] != 1) {
                        if (levelMax < L) {
                            answer = 0;
                        }
                        levelMax = Math.max(levelMax, L);
                        answer++;
                        checked[j] = 1;
                        Q.offer(j);
                    }
                }
            }
            L++;
        }

        return answer;

    }

}
