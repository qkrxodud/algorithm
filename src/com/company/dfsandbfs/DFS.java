package com.company.dfsandbfs;


public class DFS {
    Node root;
    public static void main(String [] args) {
        DFS dfs = new DFS();
        dfs.root = new Node(1);

        dfs.root.setLt(new Node(2));
        dfs.root.setRt(new Node(3));

        dfs.root.getLt().setLt(new Node(4));
        dfs.root.getLt().setRt(new Node(5));
        dfs.root.getRt().setLt(new Node(6));
        dfs.root.getRt().setRt(new Node(7));

        dfs.DFS(dfs.root);
    }

    public void DFS (Node node) {
        if (node == null) return;
        else {
            DFS(node.getLt());
            DFS(node.getRt());
        }
    }
}
