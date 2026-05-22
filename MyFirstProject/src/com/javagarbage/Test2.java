package com.javagarbage;

public class Test2 {
	
	String name ="bhumi";
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
	void m1() {
		Test2 t = new Test2();
	}
	
	
//		TODO Auto-generated method stub
			
	public static void main (String[] args) {
		System.out.println("main method started");
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
        //nullifying the object
		t1 = null;
        //Re-asssigning the object
		Test2 t4 = new Test2();
		t4 = t2;
		System.out.println(t4);
		System.out.println(t2);
       //Anonymous object creation
		System.out.println(new Test2().name);
		
      //object inside the method
		t4.m1();
		
		System.gc();
		System.out.println("main method ended");
		
	}
	

	}

