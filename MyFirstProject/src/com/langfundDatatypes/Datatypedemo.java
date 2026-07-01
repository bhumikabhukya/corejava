package com.langfundDatatypes;

public class Datatypedemo {
	//BYTE
	//Range :-128 to 127
	//By default, all integer literals are int
	
	byte b =(byte) 257; // Explicit Type Casting
	
	//SHORT
	//range : -32768 to 32767
	
	short s = b; // Implicit Type Casting (byte - short)
	short s1 =(short) 65535; //Explicit Type Casting
	
	//INT
	//Range :-2147483648 to 2147483647
	
	int i = s1; // Implicit Type Casting (short-int)
	int i1 = (int) 2147483648L; //Explicit Type Casting
	
	//LONG
	//Range :
    //	-9223372036854775808 to 
	//   9223372036854775807
	long l = i; // Implicit Type Casting (int-long)
	long l1 =9223372036854775807L;
	long l2 =9223372036854775807L;
	
	//FLOAT
     // Range : approximately ±3.4E38
	//Precision : 5 to 6 decimal digits
	float f = l1; //Implicit Type Casting (long → float)
    float f1 = 5.65676478765465F;
    //DOUBLE
    // Range : Approximately ±1.7E308
    //Precision : 10 to 15 decimal digits
    double d =  5.65676478765465;
    double d1 = f1; // Implicit Type Casting (float → double)
   // CHAR & BOOLEAN
    char c;
    boolean boo;
    
	public static void main(String[] args) {
		System.out.println("Main Method strted");
		Datatypedemo t = new Datatypedemo();
		
		System.out.println("byte value :"+ t.b);
		System.out.println("short value :"+ t.s);
		System.out.println("short value :"+ t.s1);
		System.out.println("int value :"+ t.i);
		System.out.println("int value :"+ t.i1);
		System.out.println("long value :"+ t.l);
		System.out.println("long value :"+ t.l1);
		System.out.println("float value :"+ t.f);
		System.out.println("float value :"+ t.f1);
		System.out.println("double value :"+ t.d);
		System.out.println("double value :"+ t.d1);
		System.out.println("char value :"+ t.c);
		System.out.println("boolean value :"+ t.boo);
	}

}
