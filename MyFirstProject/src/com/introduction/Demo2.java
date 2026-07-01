package com.introduction;

public class Demo2 {

	public static void main(String[] args) {
	System.out.println("main method started");
	m1 ();
	
	Demo2 t = new Demo2();
	t.m2 ();
	
	}
	public static void m1() {
		System.out.println("m1 called");
		
	}
	void m2() {
		m3();
		System.out.println("m2 called");
	}
	void m3() {
		m4();
		System.out.println("m3 called");
		
	}
	public static void m4() {
		
		
		Demo2 t = new Demo2();
		t.m5();
		System.out.println("m4 called");
		
	}
	void m5() {
		System.out.println("m5 called");
	}

}
