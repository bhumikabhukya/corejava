package com.Lstatements;

public class ForLoopProduct {

	public static void main(String[] args) {

    long product =1;
    
    for (int i =1; i <= 10; i++) {
    	product = product *i;
    }
    System.out.println("product of numbers from 1 to 10 is:"+product);
	}
}
