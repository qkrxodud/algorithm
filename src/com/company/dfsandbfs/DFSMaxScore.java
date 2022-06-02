package com.company.dfsandbfs;

import java.util.Scanner;

public class DFSMaxScore {
    static int count = 0;
    static int maxHour = 0;

    static int [] problem;
    static int [] times;

    static  int tempMaxScore;

    public static void main (String[] args) {
        DFSMaxScore dfsMaxScore = new DFSMaxScore();
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
        maxHour = in.nextInt();
        problem = new int[count];
        times = new int[count];

        for (int i = 0; i < count; i++) {
            problem[i] = in.nextInt();
            times[i] = in.nextInt();
        }
        dfsMaxScore.solution();
    }

    void solution() {
        DFS(0 , 0, 0);
        System.out.println(tempMaxScore);
    }

    void DFS(int L, int scoreSum, int timeSum) {
        if (count == L) {
            if (timeSum <= maxHour) {
                tempMaxScore = Math.max(tempMaxScore, scoreSum);
            }
        } else  {
            DFS(L+1 , scoreSum + problem[L], timeSum + times[L]);
            DFS(L+1 , scoreSum, timeSum);
        }

    }
}
