package com.Lstatements;

import java.util.Scanner;

public class Task9animalsMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char repeat;

		System.out.println("main menu");
		do {
			System.out.println("1. Domestic animals");
			System.out.println("2.wild animals");
			System.out.println("exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Domestic animals");
				System.out.println("1.cow");
				System.out.println("2 Dog");
				System.out.println("enter your choice");

				int domestic = sc.nextInt();

				switch (domestic) {
				case 1:
					System.out.println("selected animal:cow");
					break;
				case 2:
					System.out.println("selected snimal:Dog");
					break;
				case 3:
					System.out.println("invalid choice");
				}
				break;
			case 2:
				System.out.println("wild animals");
				System.out.println("1.lion");
				System.out.println("tiger");
				System.out.println("enter your choice");
				int wild = sc.nextInt();

				switch (wild) {
				case 1:
					System.out.println("selected animal:lion");
					break;
				case 2:
					System.out.println("selected animal:tiger");
					break;
				default:
					System.out.println("invalid wild animal choice");
				}
				break;
			case 3:
				System.out.println("exiting program");
				return;
			default:
				System.out.println("invalid main menu choice");
			}
			System.out.println("Do you want to continue?(y/n)");

			repeat = sc.next().charAt(0);
		} while (repeat == 'y' || repeat == 'Y');
		System.out.println("program ended");

	}

}
