package com.LogicalOper;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("welcome to India!");
			System.out.println("you are eligible for voting & driving!");

		} else {
			System.out.println("not eligible");
			System.out.println("welcome");
		}

		System.out.println("main method ended");
	}
}
