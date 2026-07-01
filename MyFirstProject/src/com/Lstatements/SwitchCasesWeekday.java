package com.Lstatements;

import java.util.Scanner;

public class SwitchCasesWeekday {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number :");
	int num =sc.nextInt();
	switch (num) {
	case 1-> System.out.println("sunday");
	case 2-> System.out.println("monday");
	case 3-> System.out.println("Tuesday");
	case 4-> System.out.println("wednesday");
	case 5-> System.out.println("thursday");
	case 6-> System.out.println("friday");
	case 7-> System.out.println("saturday");
	default->System.out.println("invalid entry");
	}

	}

}
