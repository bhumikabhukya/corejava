package com.langfundDatatypes;
import java.util.Scanner;

public class TaskCalculator2 {
	Scanner sc= new Scanner(System.in);
	//add
	void add1() {
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("addtion ="+(a=b));
		
	}
	//add(int a, int b)
	void add2(int a, int b) {
		System.out.println("addition ="+(a=b));	
	}
	//add(int a, int b, int c)
	void add3(int a,int b,int c) {
		System.out.println("addition ="+(a+b+c));
	}
	//subtraction
	void sub() {
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("subtraction ="+(a-b));
	
	}
	//sub(int a, int b)
	void sub(int a,int b) {
		System.out.println("subtraction ="+(a-b));
		}
	// sub(int a, int b,int c)
	void sub(int a,int b,int c) {
		System.out.println("subtraction ="+(a-b-c)); 
	}
	//multiplication
	void mul() {
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplicatiom="+(a*b));
		
	}
	//mul(int a,int b)
	void mul(int a,int b) {
		System.out.println("multipliation ="+(a*b));
		
	}
    void mul(int a,int b,int c) {
    	System.out.println("multiplication ="+(a*b*c));
    	
    }
    //division()
    void div() {
    	System.out.println("Enter two numbers: ");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	if (b !=0)
    	System.out.println("Division ="+ ((double) a/b));
    	else
    		System.out.println("cannot divide by zero");
     }
    // division(int a,int b)
    void div1(int a,int b) {
    	if(b !=0)
    		System.out.println("Division ="+((double) a/b));
    	else
    		System.out.println("cannot divide by zero");
    }
    		
    public class TaskCalculatorDemo {
   
 	public static void main(String[] args) {
 		
		TaskCalculator2 c = new TaskCalculator2();
		
		c.add1();
		c.add2(10,20);
		c.add3(10,20,30);
		
		c.sub();
		c.sub(50,20);
		c.sub(100,30,20);
		
		c.mul();
		c.mul(2,5);
		c.mul(3,5,6);
		
		c.div();
		c.div1(40,2);
		
 	}
	}

}
