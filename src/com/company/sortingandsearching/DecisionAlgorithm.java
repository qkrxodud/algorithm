package com.company.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm {
    public static void main (String [] args) {
        DecisionAlgorithm decisionAlgorithm = new DecisionAlgorithm();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int albumCount = in.nextInt();
        int [] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        decisionAlgorithm.solution(count, albumCount, arr);
    }

    // 이분검색 최소값 찾기의 포인트는.
    // 배열의 범위안에 내가 원하는 값이 있을때 사용한다.
    // 최소값을 찾을때요 유용하다.
    // 포인트는 lt, rt를 사용해서 범위를 줄여 나간다는 것이다.!

    void solution(int count, int albumCount, int [] arr) {
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            // 중요 포인트!!!
            int maxAlbumCount = calcAlbumCount(arr, mid);
            if(maxAlbumCount <= albumCount) {
                //용량을 줄인다.
                answer = mid;
                rt = mid -1;
            } else {
                //용량을 늘린다.
                lt = mid + 1;
            }
        }

        System.out.println(answer);

    }
    int calcAlbumCount(int [] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int i : arr) {
            if (sum + i > capacity) {
                cnt++;
                sum = i;
            } else {
                sum += i;
            }
        }
        return cnt;
    }
}
