package com.company.dfsandbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSSearchCow {
    int answer = 0;
    int [] jump = {1, -1, 5};
    int [] ch;
    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        BFSSearchCow main = new BFSSearchCow();
        Scanner in = new Scanner(System.in);
        int person = in.nextInt();
        int cow= in.nextInt();
        System.out.println(main.BFS(person, cow));

    }
    int BFS(int person, int cow) {
        ch = new int [10001];
        ch[person] = 1;
        queue.offer(person);
        int L = 0;
        // Q 비어 있을 때 까지 진행
        while(!queue.isEmpty()) {
            int len = queue.size();

            // Q size 만큼 for문을 실행한다.
            for (int i=0; i<len; i++) {
                // Q 에서 맨 처음 들어간 값을 빼고.
                int x = queue.poll();
                if (x == cow) return L;
                //
                // 3개의 조건의 값을 Q의 값과 계산 후
                // 넣는다.
                for (int j=0; j<3; j++) {
                    int nx = x + jump[j];
                    if (nx >=1 && nx <10000 && ch[nx] ==0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
    return 0;
    }
}
