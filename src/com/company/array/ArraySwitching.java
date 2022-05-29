package com.company.array;

public class ArraySwitching {
    public static void main(String [] ars) {
        // N=6인 예제 3번
        int []A = {  7, -5, -5, -5, 7, -1, 7};

        if (A.length < 2) {
            System.out.println(A.length);
        } else {
            int ans = 2;
            int temp_ans = 2;

            for (int i = 2; i < A.length; i++) {
                if (A[i] == A[i-2]) { //
                    temp_ans = temp_ans + 1;
                } else {  //
                    temp_ans = 2;
                }
                ans = Math.max(temp_ans, ans);
            }
            System.out.println(ans);
        }

    }
}

/*
//배열규칙이 같은경우
            System.out.print(A[i-1] + "/" + A[i] + "  if = diff"+(diff * (-1))+"/calc"+(A[i-1] - A[i])+"");
            System.out.println("");
            // 7 ,4  (0 == 3)     4,-2  (-3 == 2)      -2,4 (5 == -6)       4,-2 ( -6 == 6)
            //diff = 3;           diff = -5            diff = -6
            //max = 0             max = 0              max = 0
 */
