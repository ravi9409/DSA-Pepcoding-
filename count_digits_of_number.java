package com.coursecube.spring;

import java.util.Scanner;

class count_digits_of_number {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the nth input");
        int a = scanner.nextInt();
        while (a != 0) {
            a = a / 10;
            count++;
        }
        System.out.println(count);

    }

}
