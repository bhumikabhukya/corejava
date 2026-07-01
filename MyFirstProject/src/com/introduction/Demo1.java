package com.introduction;

public class Demo1 {
	
 public static void welcome() {
	System.out.println("Welcome to java");
}
	public static void main(String[] args) {
		
	System.out.println("Main method started");
	welcome();
	Demo1 d = new Demo1();
	d.hello();
	d.java();
	Demo1 d1 = new Demo1();
	d1.java();
	}
	
	void hello() {
		
	System.out.println("good evening");
	System.out.println("java full stack");
	}
	void java() {
		System.out.println("java class");
	}
	
}


