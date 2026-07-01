package com.langfundDatatypes;

public class Studentinfo {
	void main() {
		System.out.println("student details !");
		getStudentName("bhumi");//call by value parameter
		getAge(22);
		feeInfo(25000.0);
		heightAndweightInfo(5.5f,40.0);
		
	}
   // method with arguments
	void getStudentName(String name) {
		System.out.println("student Name is:"+name);
	}
	void getAge(int age) {
		System.out.println("Student Age is:"+age);
	}
	void feeInfo(double fee) {
		System.out.println("student fee is:"+fee);
	}
	void heightAndweightInfo(float h,double w) {
		System.out.println("student height is :"+h);
		System.out.println("student weight is:"+w); 
	}
	

	}


