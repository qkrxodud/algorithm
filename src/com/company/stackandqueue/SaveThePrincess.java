package com.company.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SaveThePrincess {
    public static void main (String [] args) {
        SaveThePrincess saveThePrincess = new SaveThePrincess();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        saveThePrincess.solution(n, k);
    }

    void solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=n; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()) {
            for (int i=0; i<k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                System.out.println(queue.poll());
            }
        }
    }
}
