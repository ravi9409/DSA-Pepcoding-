package com.example.majorproject;

public class prac {
	public static void main(String[] args) {
		int a = 47;
		int count = 2;
		boolean flag = true;
		for (int i = 0; i < a - 2; i++) {// 0,
			if (a % count == 0)//
				System.out.println("Not Prime");
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
