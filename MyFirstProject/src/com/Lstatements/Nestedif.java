package com.Lstatements;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		System.out.println("welcome to Vcube matrimonial");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your full name:");
		String name = sc.nextLine();

		System.out.println("nice to meet you mr :" + name);
		System.out.println("tell me about your assets & current package:");

		double assets = sc.nextDouble();
		System.out.println("enter your salary:");
		double salary = sc.nextDouble();

		if (assets >= 4000000.00 && salary >= 250000.00) {
			System.out.println("okay !! good to go");

			System.out.println("enter your age:");
			int age = sc.nextInt();

			if (age <= 28 && age >= 26) {
				System.out.println("oh okay nice to meet you");

				System.out.println("enter your height");
				float height = sc.nextFloat();
				if (height >= 5.6 && height <= 6.0) {
					System.out.println("okay to proceed !!");

					System.out.println("enter your weight:");
					double weight = sc.nextDouble();
					if (weight >= 65 && weight <= 70) {
						System.out.println("okay to finalize");

						System.out.println("do you have siblings");
						boolean sibstatus = sc.nextBoolean();
						if (!sibstatus) {
							System.out.println("will proceed to meet next discussion");
						} else {
							System.out.println("OMG");
						}
					} else {
						System.out.println("you must need to join gym");
					}
				} else {
					System.out.println("you are too short or long,not matching");
				}

			} else {
				System.out.println("your age not matching with our profile !");
			}
		} else {
			System.out.println("you can leave for the day");

		}
	}

}
