package oopspractice;

public class ReverseString {

	public static void main(String[] args) {


		String s = "Selenium";
		int len = s.length();

		String rev = "";

		for(int i =len-1;i>=0; i--) {
			rev = rev+s.charAt(i);
		}

		System.out.println(rev);

		System.out.println("*****************************");


		String a = "Selenium Automation";

		StringBuffer sb = new StringBuffer(a);

		System.out.println(sb.reverse());

		String b = "Automation";
		StringBuilder s1 = new StringBuilder(b);		
		System.out.println(s1.reverse());

		String name = " Vinod";
		String Name = 	reverseString(name);
		System.out.println(Name);






		String name1 = "Selenium Automation";

		int len1 = 	name1.length();

		String rev1 = "";


		for(int i=len-1; i>=0;i--) {
			rev1 = rev1+name1.charAt(i);

		}

		System.out.println(rev1);

	}


	public static String reverseString(String inputString) {

		StringBuilder reverseString = new StringBuilder();

		for(int i =inputString.length()-1; i>=0; i-- ) {
			reverseString.append(inputString.charAt(i));

		}
		return reverseString.toString();
	}	








}
