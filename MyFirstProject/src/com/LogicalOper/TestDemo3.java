

package com.LogicalOper;
import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks% like 10th Inter Btech");
		System.out.println("10th%:");
		double tenthMarksSp=sc.nextDouble();
		System.out.println("Inter%:");
		double InterMarksSp=sc.nextDouble();
		System.out.println("Btech%:");
		double BtechMarksSp=sc.nextDouble();
		if(tenthMarksSp>=60 && InterMarksSp >=60 && BtechMarksSp >=60) {
			System.out.println("you are eligible for MNC Organization placements!!");
		}else {
			System.out.println("Dont give up!! there are lakhs of startups !!");
			System.out.println("marks dose not matter skills are important");
		}
	}

}
