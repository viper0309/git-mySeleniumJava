package com.java.tests;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("start");
	try {
		
		 int a=10/0;
		 System.out.println("the value of 10 divide by 0 "+a);	
		
	}catch(Exception a){
System.out.println(a.getMessage());
	}

}
}
