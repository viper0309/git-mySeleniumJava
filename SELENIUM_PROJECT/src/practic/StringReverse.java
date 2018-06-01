package practic;

import java.util.Stack;

public class StringReverse {

	public static void main(String[] args) {
		String c = "Thailand";
		StringBuffer a = new StringBuffer(c);
		a.reverse();
		System.out.println(a);	
			
		
			String name = "Shreya";
			String a[] = name.split("");
			System.out.println(name);
			
			for(int b=a.length-1;b>=0;b--)
			{
				
				System.out.println(a[b] + " ");
			}
					
		String s="shreya";
		Stack stack=new Stack();
		for(int i=0;i<=s.length()-1;i++)
		{
			stack.push(s.charAt(i));
		}
		
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(stack.pop());
		}
		
	


	}

}
