package com.introduction;

public class Product {
	String storename;
	int productid;
	String productname;
	int productprice;
	void display() {
		System.out.println("stroename:"+storename);
		System.out.println("id:"+productid);
		System.out.println("pname:"+productname);
		System.out.println("pprice:"+productprice);
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.storename="smart";
		p.productid=1;
		p.productname="oil";
		p.productprice=50;
		p.display();
	}

}


