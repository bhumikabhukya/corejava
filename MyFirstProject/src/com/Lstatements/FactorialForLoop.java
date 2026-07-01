package com.Lstatements;

import java.util.Scanner;

public class FactorialForLoop {
	static int findfact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		// int n =sc.nextInt();
		// int fact=1;
		// for(int i=n;i>=1;i--) {
//		long n=sc.nextLong();
//		long fact =1;
//		for(long i=n;i>=1;i--) {
//			fact=fact*i;
//		}
		int n = sc.nextInt();
		int factorial = findfact(n);
		System.out.println("factorial of a given number :" + factorial);
	}
}
