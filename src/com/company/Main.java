package com.company;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String [] args) {
        Main main = new Main();
        String skill = "CBD";
        String [] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(main.solution(skill, skill_trees));
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<Character> Q = new LinkedList<>();
        for (char skillValue : skill.toCharArray()) {
            Q.offer(skillValue);
        }

        for (String skill_tree : skill_trees) {
            char [] skillArr = skill_tree.toCharArray();
            boolean flag = true;

            for (char c : skillArr) {
                if (Q.contains(c)) {
                    if (Q.peek() != c) {
                        flag = false;
                        break;
                    } else {
                        Q.poll();
                    }
                }
            }

            if (flag == true) answer++;

            Q.removeAll(Q);
            for (char skills : skill.toCharArray()) {
                Q.offer(skills);
            }
        }
        return answer;
    }


}
