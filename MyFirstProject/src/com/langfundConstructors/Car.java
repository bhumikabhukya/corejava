package com.langfundConstructors;

public class Car {
	String brand;
	String model;
	double price;
	double mileage;
	String color;
	
	Car(){
		System.out.println("no arg constructors");
		brand="toyota";
		model="carmy";
		price=100000;
		mileage=250.0;
		color="black";
	}
	Car(String brand,String model,double price,String color){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
	}
	Car(String brand,String model,int mileage,String color){
		this.brand=brand;
		this.model=model;
		this.mileage=mileage;
		this.color=color;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Car c1 = new Car();
		c1.CarInfo();
		Car c2 = new Car("honda","city",150000,"white");
		c2.CarInfo();
		Car c3 = new Car("tata","nexon",3566.0,"blue");
		c3.CarInfo();

	}
	void CarInfo() {
		System.out.println("brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
		System.out.println("mileages:"+mileage);
		System.out.println("color:"+color);
	}

}
