package com.langfundConstructors;

public class Animal {
	String name;
	String color;
	//constructors chaning super:
	public Animal() {
		System.out.println("Animal class constructors called from");
	}
	public Animal(String name,String color) {
		System.out.println("parameterized constructors called from animal");
		this.name=name;
		this.color=color;
	}
	
	
	public static void main(String[] args ) {
		System.out.println("main method started from Animal");
		
	}
	class Cat extends Animal{
	public Cat(String name ,String color) {
		super(name,color);
		System.out.println("parameterized constructors called cat");
	}

	public static void main(String[] args) {
		System.out.println("main method started from cat");
		
		Animal a= new Animal();
		Cat c = a.new Cat("puppy","black");		
		System.out.println(c.name);
		System.out.println(c.color);

	}
	}
}
	


