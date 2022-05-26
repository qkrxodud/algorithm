package com.company.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EducationPlan {
    public static void main (String [] args) {
        EducationPlan educationPlan = new EducationPlan();
        Scanner in = new Scanner(System.in);
        String need = in.next();
        String plan = in.next();

        educationPlan.solution(need, plan);
    }

    void solution(String need, String plan) {
        boolean result = true;
        Queue<Character> queue = new LinkedList<>();
        for (Character c : need.toCharArray()) {
            queue.offer(c);
        }

        for (Character c : plan.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c) {
                    result = false;
                }
            }
        }
        if(queue.size() > 0) {
            result = false;
        }
        System.out.println(result);
    }
}
