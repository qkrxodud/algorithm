package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static int[] numbers;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        numbers = new int[]{3, 30, 601, 621 , 0 ,300, 301, 34, 5, 9};
        for (int i : numbers) {
            list.add(i);
        }
        System.out.println(main.solution());
    }

    public String solution() {
        String answer = "";
        ArrayList<String> strNumbers = new ArrayList();
        // int 형을 String 으로 변환한다.
        for(Integer num : numbers){
            strNumbers.add(String.valueOf(num));
        }

        // 문장의 숫자를 뒷 배열 + 앞 배열을 합친 것과 앞 배열 + 뒷 배열을 합친값을 비교
        Collections.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int temp = (o2+o1).compareTo(o1+o2);
                return temp;

            }
        });

        if(strNumbers.get(0).startsWith("0")) return "0";
        for (String s : strNumbers) {
            answer+=s;
        }
        return answer;

    }

}


