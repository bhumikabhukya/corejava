package com.Lstatements;
import java.util.Scanner;

public class FactorsDivisorsfloop {
	static void findFactor(int n) {
		for(int i=1; i<=n/2; i++) {
			if(n% i==0) {
				System.out.print(i+" ");
				
			}
		}
			System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		findFactor(n);
		
		
	}

}
