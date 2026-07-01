package com.Lstatements;

//WAP to print even and odd numbers..?from  1 to 10
public class ForLoopEvenOdd {

	public static void main(String[] args) {
       System.out.println("even number:");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("odd number:");
		for (int i =1; i <=20; i++) {
			if (i % 2 != 0) {
				System.out.println(i+" ");
			}
		}

	}
}
	
	


