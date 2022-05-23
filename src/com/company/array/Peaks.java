package com.company.array;

import java.util.Scanner;

public class Peaks {
    public static void main(String [] ars) {
        Peaks peaks = new Peaks();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [][] arr = new int[count][count];
        for (int i=0; i<count; i++) {
            for (int j=0; j<count; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        peaks.solution(count, arr);
    }

    private void solution(int count, int [][] arr) {
        int answer = 0;
        int [] dx = {-1,0,1,0};
        int [] dy = {0,1,0,-1};

        for (int i=0; i<count; i++) {
            for (int j=0; j<count; j++) {
                boolean flag = true;

                for (int k=0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if (nx>=0 && nx<count && ny>=0 && ny<count && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) answer++;

            }
        }
        System.out.println(answer);
    }
}
