package com.Lstatements;
import java.util.Scanner;

public class Task8ticketprice {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter movie name");
    String movie=sc.next();
    
    System.out.println("movie caterogy");
    char caterogy =sc.next().charAt(0);
    switch(caterogy) {
    case 'G'|'g':
    	System.out.println("150");
    	break;
    case 'p'|'p':
    	System.out.println("250");
    	break;
    case 'v'|'v':
    	System.out.println("400");
    	break;
    	default:
    		System.out.println("no movie played");
    	
    }
	}

}
