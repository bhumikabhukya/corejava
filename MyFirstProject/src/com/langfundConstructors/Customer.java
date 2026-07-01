package com.langfundConstructors;

public class Customer {
	String custname;
	int custid;
	int custage;
	double custsalary;
	
	Customer(){
		this("bhumi",101);
		System.out.println("no arg constructor");
		
		
	}
	

	public Customer(String custname, int custid) {
		
		this(custname,custid,25);
		this.custname = custname;
		this.custid = custid;
	}
	public Customer(String custname, int custid, int custage) {
		this(custname,custid,custage,50000);
		this.custname = custname;
		this.custid = custid;
		this.custage = custage;
	}

	public Customer(String custname, int custid, int custage, double custsalary) {
	     
		this.custname = custname;
		this.custid = custid;
		this.custage = custage;
		this.custsalary = custsalary;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Customer c1 = new Customer();
		c1.customerInfo();
		Customer c2 = new Customer("bhumi",1022);
		c2.customerInfo();
		Customer c3 = new Customer("bindu",111);
		c3.customerInfo();
		Customer c4 = new Customer("kalpana",112,26);
		c4.customerInfo();

	}
    void customerInfo() {
    	System.out.println("custname:"+custname);
    	System.out.println("custid:"+custid);
    	System.out.println("custage:"+custage);
    	System.out.println("custsalary:"+custsalary);
    	System.out.println("**************************");
    	
    }
}
