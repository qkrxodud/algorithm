package com.company.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class KakaoBalloonPop {
    public static void main (String [] args) {
        KakaoBalloonPop kakaoBalloonPop = new KakaoBalloonPop();
        Scanner in = new Scanner(System.in);
        int boardCount = in.nextInt();
        int [][] board = new int[boardCount][boardCount];
        for(int i=0; i<boardCount; i++) {
            for(int j=0; j<boardCount; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int moveCount = in.nextInt();
        int [] moves = new int[moveCount];
        for(int i=0; i<moveCount; i++) {
            moves[i] = in.nextInt();
        }
        kakaoBalloonPop.solution(boardCount, board, moveCount, moves);
    }

    void solution(int boardCount, int [][] board, int moveCount, int [] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moveCount; i++) {
            for(int j=0; j<boardCount; j++) {
                if (board[j][moves[i]-1] != 0) {
                    int temp = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer+=2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
