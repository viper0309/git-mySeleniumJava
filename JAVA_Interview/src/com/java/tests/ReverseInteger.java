package com.java.tests;

public class ReverseInteger {

	public static void main(String[] args) {
		//usimg algo
int num=1234;
int rev=0;
while(num !=0) {
	rev=rev*10+num%10;//%it call reminder, modulus
	num=num/10;
}
System.out.println(rev);
System.out.println("--------------------------------");
int num1=34567;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
