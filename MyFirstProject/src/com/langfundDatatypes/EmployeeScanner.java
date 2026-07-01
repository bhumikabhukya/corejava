package com.langfundDatatypes;
import java.util.Scanner;


public class EmployeeScanner {
   	

	public static void main(String[] args) {
		System.out.println("welcome to vcube organization");
		
		Scanner sc = new Scanner(System.in);
		EmployeeScanner s = new EmployeeScanner();
		
		System.out.println("enter organization name:");
		String orgName = sc.nextLine();
		
		System.out.println("enter employee name:");
		String EmpName = sc.nextLine();
		System.out.println("enter employee salary:");
		double sal = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("enter employee city:");
		String city = sc.nextLine();
		System.out.println("enter emloyee id:");
		int id = sc.nextInt();
		System.out.println("enter employee marks:");
		int marks = sc.nextInt();
		System.out.println("enter employee rank");
		int rank = sc.nextInt();
		System.out.println("enter employee height");
		float height = sc.nextFloat();
		System.out.println("enter employee per");
		float per = sc.nextFloat();
		System.out.println("enter employee price");
		float price = sc.nextFloat();
		System.out.println("enter employee kg");
		float kg = sc.nextFloat();
		System.out.println("enter employee km");
		float km = sc.nextFloat();
		System.out.println("enter employee profit");
		float profit = sc.nextFloat();
		System.out.println("enter employee loss");
		float loss = sc.nextFloat();
		System.out.println("enter employee income");
		float income = sc.nextFloat();
		System.out.println("enter employee weight");
		double weight = sc.nextDouble();
		System.out.println("enter employee temp");
		double temp = sc.nextDouble();
		System.out.println("enter employee blance");
		double balance = sc.nextDouble(); 
		System.out.println("enter employee phone");
		long phone = sc.nextLong();
		System.out.println("enter employee account");
		long account = sc.nextLong();
		System.out.println("enter employee pancard");
		long pancard = sc.nextLong();
		System.out.println("enter employee grade");
		char grade = sc.next().charAt(0);
		System.out.println("enter employee gender");
		char gender = sc.next().charAt(0);
		
		
		s.getOrgName(orgName);
		s.getEmpName(EmpName);
		s.getEmpSalInfo(sal);
		s.getEmpCurrentCity(city);
		s.getEmpId(id);
		s.getEmpMarks(id);
		s.getEmprank(rank);
		s.getEmpheight(height);
		s.getEmpper(per);
		s.getEmpprice(price);
		s.getEmpkiloGrams(kg);
		s.getEmpkiloMeter(km);
		s.getEmpprofit(profit);
		s.getEmploss(loss);
		s.getEmpincome(income);
		s.getEmpweight(weight);
		s.getEmptemp(temp);
		s.getEmpbalance(balance);
		s.getEmpphone(phone);
		s.getEmpaccount(account);
		s.getEmppancard(pancard);
		s.getEmpgrade(grade);
		s.getEmpgender(gender);
		sc.close();
	
		}
	
   void getOrgName(String orgName) {
	   System.out.println("organization name :"+ orgName);
   }
   void getEmpName(String EmpName) {
	   System.out.println("Employee name is :"+ EmpName);
   }
   void getEmpSalInfo(double sal) {
	   System.out.println("Employee salary is :"+ sal);
   }
   void getEmpCurrentCity(String city) {
	   System.out.println("current city is:"+ city);
   
   }
   void getEmpId(int id) {
       System.out.println("Employee id is :"+ id);
       
   }
   void getEmpMarks(int marks) {
	System.out.println("Employee marks is:"+ marks);
   }
	void getEmprank(int rank) {
		System.out.println("Employee rank is:"+ rank);
	}
	void getEmpheight(float height) {
		System.out.println("Employee height is:"+ height);
	}
	void getEmpper(float per) {
		System.out.println("Employee per is:"+ per);
	}
	void getEmpprice(float price) {
		System.out.println("Employee price is:"+ price);
	}
	void getEmpkiloGrams(float kg) {
		System.out.println("Employee kg is:" + kg);
	}
	void getEmpkiloMeter(float km) {
		System.out.println("Employee km is:"+ km);
	}
	void getEmpprofit(float profit) {
		System.out.println("Employee profit is:"+ profit);
	}
	void getEmploss(float loss) {
		System.out.println("Employee loss is:"+ loss);
	}
	void getEmpincome(float income) {
		System.out.println("Employee income is:"+ income);
	}
	void getEmpweight(double weight) {
		System.out.println("Employee weight is:"+ weight);
	}
	void getEmptemp(double temp) {
		System.out.println("Employee temp is:"+ temp);
	
	}
	void getEmpbalance(double balance) {
		System.out.println("Employee blance is:"+ balance);
	}
	void getEmpphone(long phone) {
		System.out.println("Employee phone is:"+ phone);
	}
	void getEmpaccount(long account) {
		System.out.println("Employee account is:"+ account);
	}
	void getEmppancard(long pancard) {
		System.out.println("Employee pancard is:"+ pancard);
	}
	void getEmpgrade(char grade) {
		System.out.println("Employee grade is:"+ grade);
	}
	void getEmpgender(char gender) {
		System.out.println("Employee gender is:"+ gender);
	}
	
	
}
	
	
	
	


   
   
