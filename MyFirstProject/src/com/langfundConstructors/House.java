package com.langfundConstructors;

public class House {
	int room;
	String location;
	double price;
//no-arg constructor
    House(){
    	System.out.println("no arg constructor");
    	room=2;
    	location="kphb";
    	price=90000.00;
    	    	
    }
    //parameterized constructor
    
    House(int room,String location,double price){
    	this.room=room;
    	this.location=location;
    	this.price=price;
    }
    House(String location,double price){
    	this.location=location;
    	this.price=price;
    }
    House(int room,String location){
    	this.room=room;
    	this.location=location;
    }
    
	public static void main(String[] args) {
		System.out.println("main method started");
		House h1 = new House();
		h1.houseInfo();
		House h2 = new House(2,"hyd",5000.00);
		h2.houseInfo();
		House h3 = new House("wgl",20000);
		h3.houseInfo();
		House h4 =new House(3,"kmm");
		h4.houseInfo();

	}
    void houseInfo() {
    	System.out.println("room:"+room);
    	System.out.println("location:"+location);
    	System.out.println("price:"+price);
    }
}
