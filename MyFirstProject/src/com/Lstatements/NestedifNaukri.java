package com.Lstatements;
import java.util.Scanner;

public class NestedifNaukri {

	public static void main(String[] args) {
		//create Scanner object to take user input
		Scanner sc=new Scanner(System.in);
		//step-1 check if user is registered
		System.out.println("are you registered?:");
		boolean isRegistered = sc.nextBoolean();
		
		if(isRegistered) {
			//step -2 check if profile is corrected
			System.out.println("is your profile is completed?:");
		boolean	isProfileComplete =sc.nextBoolean();
		
		if(isProfileComplete) { //Nested if 1
			//step-3 check java skills
			System.out.println("Do you have java skills?:");
		boolean hasJava=sc.nextBoolean();
		
		if(hasJava) { //Nested if 2
			//step-4 check sql skills
			System.out.println("Do you have sql skills?:");
			boolean hasSql=sc.nextBoolean();
			
			if(hasSql) { //Nested if 3
			// step-5 check communication skills
				System.out.println("Do you have communication skills?:");
				boolean hasCommunication =sc.hasNextBoolean();
				
			if(hasCommunication) { //Nested if 4
				//final condition:all skills satisfied
				System.out.println("your eligible for top IT job");
			
			
			}else {
				// communication skill is missing
				System.out.println("improve communication skills");
			}
			}else {
				//sql skills is missing
				System.out.println("sql skill is required");
			}
		}else {
			// java skills is missing
			System.out.println("java skills is required");
		}
		}else {
			System.out.println("please complete your profile first");
		}
	} else {
		// user not registered
		System.out.println("please register first");
		
			
	   }
	    
	}
}
			
		
		
		
	

 
