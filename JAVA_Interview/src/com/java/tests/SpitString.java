package com.java.tests;

public class SpitString {

	public static void main(String[] args) {
String s="shreya yum interview";
String []splitNmae=s.split(" ");
for(int i=0;i<splitNmae.length;i++) {
	System.out.println(splitNmae[i]);
}
String name="alyssa-prajit-mommy";
String []nameSpit=name.split("-");
for(int i=0;i<nameSpit.length;i++) {
	System.out.println(nameSpit[i]);
	System.out.println();
	
	
	if(nameSpit[i].equalsIgnoreCase("alyssa")) {
		System.out.println("The validation Passed"+nameSpit);
	break;	
	}
}
	}

}
