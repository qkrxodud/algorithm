package com.company.array;

public class Main {
    public static void main(String [] ars) {
       int n = 6;
       for (int i=0; i<n; i++) {
           String answer = "";
           for (int j=0; j<n; j++) {
               if(j<n-1-i){
                   System.out.print(" ");
               } else{
                   System.out.print("#");
               }
           }
           System.out.println(answer);
       }
    }
}
