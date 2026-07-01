package com.langfundConstructors;

public class FoodOrder {
	int orderId;
	String customerName;
	String restaurantName;
	String itemName;
	double quantity;
	double price;
	//no arg constructor
	FoodOrder(){
		orderId=111;
		customerName="bhumi";
		restaurantName="kfc";
		itemName="chicken";
		quantity=250.00;
		price=500;
		
	}
	 FoodOrder(int orderId,String customerName,String itemName){
	     this.orderId =orderId;
		 this.customerName =customerName;
		 this.itemName =itemName;
	 }
	 FoodOrder(int orderId,String customerName,String restaurantName,String itemName,double quantity){
		 this. orderId =orderId;
		 this.customerName =customerName;
		 this.restaurantName =restaurantName;
		 this.itemName =itemName;
		 this.quantity =quantity;
	 }
	 FoodOrder(int orderId,String itemName){
		 this.orderId=orderId;
		 this.itemName=itemName;
	 }
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		FoodOrder f=new FoodOrder();
		f.foodOrderInfo();
		FoodOrder f1=new FoodOrder(101,"bindu","chickenfry");
		f1.foodOrderInfo();
		FoodOrder f2=new FoodOrder(102,"priya","Bhukya","fishfry",500);
		f2.foodOrderInfo();
		FoodOrder f3=new FoodOrder(103,"eggfry");
		f3.foodOrderInfo();
		
		System.out.println("main method ended");
		
	}
	void foodOrderInfo() {
		System.out.println("orderID:"+orderId);
		System.out.println("customerName:"+customerName);
		System.out.println("itemName:"+itemName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}

}
