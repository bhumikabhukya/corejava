package com.langfundConstructors;

public class Mobile {
	String brand;
	int ram;
	double price;
	
	Mobile(){
		System.out.println("no arg constructors");
		 brand="vivo";
		 ram=3000;
		price=20000.0;
		
	}
	Mobile(String brand,double price){
       this.brand=brand;
	   this.price=price;
	}
	Mobile(String brand,int ram,double price){
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Mobile m1=new Mobile();
		m1.mobileInfo();
		Mobile m2=new Mobile("oop",25000);
		m2.mobileInfo();
		Mobile m3=new Mobile("iphone",3500,100000);
		m3.mobileInfo();
		
	}
	void mobileInfo() {
		System.out.println("brand:"+brand);
		System.out.println("ram:"+ram);
		System.out.println("price:"+price);
	}

}
