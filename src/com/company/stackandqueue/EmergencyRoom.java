package com.company.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Patient {
    private int seq;
    private int risk;

    public Patient(int seq, int risk) {
        this.seq = seq;
        this.risk = risk;
    }

    public int getSeq() {
        return seq;
    }

    public int getRisk() {
        return risk;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "seq=" + seq +
                ", risk=" + risk +
                '}';
    }
}

public class EmergencyRoom {
    public static void main (String [] args) {

        EmergencyRoom educationPlan = new EmergencyRoom();
        Scanner in = new Scanner(System.in);
        int humanCount = in.nextInt();
        int number = in.nextInt();
        int [] risks = new int[humanCount];
        for (int i=0; i<humanCount; i++) {
            risks[i] = in.nextInt();
        }

        educationPlan.solution(humanCount, number, risks);
    }

    void solution(int humanCount, int number, int [] risks) {
        int answer = 0;
        Queue<Patient> queue = new LinkedList<>();
        for (int i=0; i<humanCount; i++) {
            queue.offer(new Patient(i, risks[i]));
        }
        while(!queue.isEmpty()) {
            Patient temp = queue.poll();
            for (Patient patient : queue) {
                if (temp.getRisk() < patient.getRisk()) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            //진료를 받을 수 있음
            if (temp != null) {
                answer++;
                if (temp.getSeq() == number) System.out.println(answer);
            }

        }
    }
}
