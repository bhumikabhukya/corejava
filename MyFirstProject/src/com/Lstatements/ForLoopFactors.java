package com.Lstatements;

import java.util.Scanner;

//WAP to print find factors or divisors of a given number..?

public class ForLoopFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		
		System.out.println("factors of " + num + "are:");
		
		for (int i=1; i <= num;i++) {
			if(num % i == 0) {
				System.out.println(i+" ");
			}
		}
		sc.close();
	}

}
