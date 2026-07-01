package com.langfundConstructors;

public class Bike {
	String brand;
	String model;
	double price;
	String color;
	
	Bike(){
		this("hero","splander");
		System.out.println("no arg constructor");
	}
	

	public Bike(String brand, String model) {
		this( brand, model,60000.00);
	}
		
	public Bike(String brand, String model, double price) {
		this .brand=brand;
		this.model=model;
		this.price=price;
			}
    public Bike(String brand, String model, double price,String color) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color=color;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Bike b1 = new Bike();
		b1.BikeInfo();
		Bike b2 = new Bike("k25","r15");
		b2.BikeInfo();
		Bike b3 = new Bike("ktm","duke");
		b3.BikeInfo();
		Bike b4 = new Bike("tvs","rrr",55900.00);
		b4.BikeInfo();
		Bike b5 = new Bike("thr","jss",8989.00,"red");
		b5.BikeInfo();
	}
	void BikeInfo() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("*******************");
	}

}
