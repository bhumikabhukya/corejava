package com.LogicalOper;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = sc.nextInt();
		//positive and negative
		if(number <0) {
			System.out.println("the number is negative:"+number);
		}
		else {
			System.out.println("the number is positive:"+number);
		}
	
	
	
	if(number>=0) {
		System.out.println("the number is positive");
	}else {
		System.out.println("the number is negative");
	}
 //even and odd numbers
	if(number% 2==0) {
		System.out.println("number is even");
	}else {
		System.out.println(" numberis odd");
	}
	}
}
	
