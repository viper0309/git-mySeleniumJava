package com.java.tests;

public class Array {

	public static void main(String[] args) {
int arr[]=new int [3];
arr[0]=30;
arr[1]=10;
arr[2]=20;
for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]);	
}
System.out.println("++++++++++++++++++++++++++++++");
String arr1[]= {"alyssa","david","shreya"};
for(int i=0;i<arr1.length;i++) {
System.out.println(arr1[i]);	
}
int doubleArray[][]=new int[3][4];

doubleArray[0][0]=12;
doubleArray[0][1]=20;
doubleArray[0][2]=1;
doubleArray[0][3]=2;

doubleArray[1][0]=12;
doubleArray[1][1]=12;
doubleArray[1][2]=12;
doubleArray[1][3]=12;

doubleArray[2][0]=12;
doubleArray[2][1]=12;
doubleArray[2][2]=12;
doubleArray[2][3]=100;


	System.out.println(doubleArray[2][3]);
	
		

int inte[]= new int[3];
inte[0]=10;
inte[1]=100;

inte[2]=180;
int i=0;
while(i<=inte.length) {
	i++;
	System.out.println(inte[i]);
	
}
	}


	}


