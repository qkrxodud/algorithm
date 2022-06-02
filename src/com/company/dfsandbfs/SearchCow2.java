package com.company.dfsandbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchCow2 {
    static int [] move = {1 , -1, 5};
    static Queue<Integer> queue = new LinkedList<>();
    static int L = 0;

    public static void main(String[] args) {
        SearchCow2 main = new SearchCow2();
        Scanner in = new Scanner(System.in);
        int person = in.nextInt();
        int cow= in.nextInt();
        main.BFS(person, cow);
    }

    void BFS(int person, int cow) {
        queue.offer(person);

        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.println(L + ":");
            for (int i = 0; i<len; i++) {
                int curr = queue.poll();
                if (curr == cow) return;
                for (int j = 0; j < move.length; j++) {
                    if (0 < curr && curr < cow) {
                        queue.offer(curr+move[j]);
                    }
                }
            }
            L++;
        }
    }
}
