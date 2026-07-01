package com.introduction;

public class Demo4 {
	static {
		System.out.println("static block");
		Demo4 t = new Demo4();
	}
	static{
		System.out.println("static block2");
		Demo4 t = new Demo4();
	}
	
	
	{
		System.out.println("instance block1");
		
	}
	{
		System.out.println("instance block2");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

	}

}
