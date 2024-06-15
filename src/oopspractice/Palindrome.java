package oopspractice;

public class Palindrome {


	public static void isPalindrome(int Num) {

		int r = 0;
		int sum = 0;
		int t;

		t = Num;

		while(Num > 0) {
			r = Num % 10;
			sum = (sum * 10) + r;
			Num = Num / 10;

		}

		if(t == sum) {
			System.out.println(t + " is a Palindrome Number");
		}
		else {
			System.out.println(t + " is Not a Palindrome Number");
		}

	}	
	public static void main(String[] args) {

		isPalindrome(15);



	}

}
