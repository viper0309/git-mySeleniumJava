package com.java.tests;

public class PassParameter {
	
	
	public static void sum(int a, int b) {
	int c=a+b;
	System.out.println("The value C is "+c);
	}
	public static int add(int a, int b) {
		int t=a+b;
		return t;
	}

	public static void main(String[] args) {
		sum(10, 20);
		int sumOfAdd=add(40,40);
		System.out.println(sumOfAdd);
		

	}

}
