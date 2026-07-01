package com.langfund;

public class College {
	
    static String collegeName = "Jntu";
    
    int studid;
    String studname;
    
    College(int id,String name){
    	studid = id;
    	studname = name;
    }
    	void display() {
    		System.out.println("studid:+studid");
    		System.out.println("studname:+studname");
    		System.out.println("collegeName:+collegeName");
    		
    	
    }
	public static void main(String[] args) {
	College c1 = new College(1,"bhumi");
	College c2 = new College(2,"bindu");
	
	c1.display();
	c2.display();
	}

}
