package com.javatest;

public class Test1 {

		protected void finalize() {
		System.out.println("Garbage collector is called");
		
	}
	  void main() {
		System.out.println("main method started");
		Test1 t1= new Test1();
		Test1 t2= new Test1();
				t1=null;
				t2=null;
				System.gc();
		System.out.println("main method ended");
}
	}


