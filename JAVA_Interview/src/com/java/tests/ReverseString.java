package com.java.tests;

public class ReverseString {

	public static void main(String[] args) {
		String s="interview";
		int len=s.length();
		String rev="";
		for(int i=len-1; i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		System.out.println("using string buffer");
		StringBuffer buffer=new StringBuffer(s);
		System.out.println(buffer.reverse());
	}

}
