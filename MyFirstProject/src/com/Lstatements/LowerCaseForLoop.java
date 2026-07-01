package com.Lstatements;

public class LowerCaseForLoop {

	public static void main(String[] args) {
		// Print all lowercase alphabets
		System.out.println("Lowercase");
		for (char ch = 'a'; ch <= 'z'; ch++) {

			System.out.print(ch + "");
		}
		// Move to the next line
		System.out.println();

		// Print vowels
		System.out.println("enter the vowels");
		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

				System.out.print(ch + " ");

		}
	}
}
