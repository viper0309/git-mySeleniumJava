package Java_Interview;

public class RemoveJunkString {

	public static void main(String[] args) {
String junk="!!!@@##$$ shreya Alyssa";
String s=junk.replaceAll("[^a-zA-Z0-9 ]", "");
System.out.println(s);
	}

}
