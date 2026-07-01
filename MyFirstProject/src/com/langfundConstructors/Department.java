package com.langfundConstructors;                                    

public class Department {
	int id;
	String name;
	public Department() {
		System.out.println("department class constrouctor called from");
		
	}
	public Department(int id,String name) {
	System.out.println("parameterized constructor called from department");	
	this.id=id;
	this.name=name;
	
	}
	public static void main(String[] args) {
		System.out.println("main method started from department");
	}
	class Employee extends Department{
		public Employee(int id,String name) {
		super(id,name);
		System.out.println("parameterized constructor called");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started from Employee");
		Department d = new Department();
		Employee e =d.new Employee(1,"hr");
		System.out.println(e.id);
		System.out.println(e.name);
	}

}
}
