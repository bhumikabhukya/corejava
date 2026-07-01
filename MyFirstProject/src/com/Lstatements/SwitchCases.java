package com.Lstatements;
import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter jersey number:");
		int jno=sc.nextInt();
		 
		switch(jno) {
		case 7:
			System.out.println("mahender sing Dhoni:");
			System.out.println("Right hand Batsman+ wicket keeping + cool captain");
			break;
			
		case 45:
			System.out.println("Rohith Sharma");
			System.out.println("After Dhoni, he is again a good captain + hit man");
			break;
			
		case 18:
		System.out.println("virat kholi");
		System.out.println("Run machine !! king kholi");
		break;
		
		default :System.out.println("entered jno is not playing today");
		}
	

	}

}
