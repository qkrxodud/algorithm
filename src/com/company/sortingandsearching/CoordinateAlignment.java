package com.company.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class CoordinateAlignment {
    public static void main(String [] args) {
        Mischief mischief = new Mischief();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int [] xArr = new int[count];
        int [] yArr = new int[count];

        for (int i = 0; i < count; i++) {
            xArr[i] = in.nextInt();
            yArr[i] = in.nextInt();
        }

        Arrays.sort(xArr);
        Arrays.sort(yArr);

        for (int i = 0; i < count; i++) {
            System.out.println(xArr[i] + " " + yArr[i]);
        }
    }
}
