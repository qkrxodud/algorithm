package com.company.dfsandbfs;

public class DFSShortNode {
    static int []A = { 4, 2, 6 ,1, 0};
    static int []T = { 0, 3, 0, 0, 5, 0, 5};
   //0 0 0 0 2 3 3
   //0 0 1 0 0 1 1

    static int [] visit = new int[T.length];
    static int cnt = 0;


    void DFS(int skill) {
        for(int i = 0; i < A.length; i++) {
            if (A[i] == skill) {
                visit[skill] = 1;
            }
        }
        for (int i = 1; i < T.length; i++) {
            if (T[i] == skill) {
                DFS(i);
            }
        }
    }

    public static void main(String [] args) {
        DFSShortNode dfsShortNode = new DFSShortNode();
        dfsShortNode.DFS(0);
        for (int i = 1; i <  visit.length; i++) {
            if (visit[i] == 1) {
                visit[i-1] = 1;
            }
        }
        int count = 0;
        for (int i : visit) {
            if (i == 1) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
