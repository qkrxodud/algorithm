package com.company.dfsandbfs;

import java.util.LinkedList;
import java.util.Queue;

//Queue을 사용한다.
public class Bfs {
    Node root;
    public static void main(String [] args) {
        Bfs bfs = new Bfs();
        bfs.root = new Node(1);

        bfs.root.setLt(new Node(2));
        bfs.root.setRt(new Node(3));

        bfs.root.getLt().setLt(new Node(4));
        bfs.root.getLt().setRt(new Node(5));
        bfs.root.getRt().setLt(new Node(6));
        bfs.root.getRt().setRt(new Node(7));

        bfs.BFS(bfs.root);
    }

    public void BFS (Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(L + " : ");

            for (int i=0; i<len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.getData());

                if (cur.getLt() != null) {
                    queue.offer(cur.getLt())  ;
                }
                if (cur.getRt() != null) {
                    queue.offer(cur.getRt());
                }
            }
            L++;
            System.out.println("");
        }
    }
}
