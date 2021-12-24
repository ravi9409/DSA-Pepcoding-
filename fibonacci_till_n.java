package com.coursecube.spring;

import java.util.Scanner;

class fibonacci_till_n {
    public static void main(String[] args) {
        int a = 0, b = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth input");
        int n = scanner.nextInt();
        if (a == 0 && b == 1) {
            System.out.println(a);
            System.out.println(b);
        }
        for (int i = 0; i < n-2; i++) {
            sum = a + b;
            System.out.println(sum);
            a=b;
            b=sum;
        }

    }

}
