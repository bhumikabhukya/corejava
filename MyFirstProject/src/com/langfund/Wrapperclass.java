package com.langfund;

public class Wrapperclass {
	

	public static void main(String[] args) {
		Integer a = 100;
		Integer b =100;
		System.out.println(a==b);//true
		Integer c = 200;
		Integer d = 200;
		System.out.println(c==d);//false -128 to 127
	}

}
