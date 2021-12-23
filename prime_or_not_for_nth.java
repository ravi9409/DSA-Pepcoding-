package com.exmaple.majorproject;

import java.util.Scanner;

public class prime_or_not_for_nth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nth term to find Prime or not");
		int a = scanner.nextInt();
		for (int i = 1; i <= a; i++) {
			primeornot(i);
		}
	}

	public static void primeornot(int a) {
		if (a == 1 || a == 2) {
			System.out.println("Prime");

		} else {

			int count = 2;
			boolean flag = true;
			for (int i = 0; i < a - 2; i++) {// 0,
				if (a % count == 0)//
					flag = false;
				else {
					count++;
				}
			}
			if (flag == false)
				System.out.println("Not Prime");
			else {
				System.out.println("Prime");
			}
		}
	}

}
