package com.coursecube.spring;

import java.util.Scanner;

class digit_of_a_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth input");
        int a = scanner.nextInt();
        int n = count(a);
        int[] a1 = new int[n];
        for (int i = 0; i < n; i++) {
            if (a != 0) {

                a1[i] = a % 10;
                a = a / 10;
            }

        }
        for (int i = a1.length - 1; i >= 0; i--) {
            System.out.println(a1[i]);

        }
    }

    public static int count(int a){
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        return count;
    }

}
