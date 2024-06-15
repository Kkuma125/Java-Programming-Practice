package oopspractice;

public class ReverseInteger {

	public static void main(String[] args) {

		int Num = 12345;
		int rev = 0;

		while(Num != 0) {
			rev = rev * 10 + Num % 10;
			Num = Num / 10;

		}

		System.out.println("Reverse Number is ::" + rev);

		int num = 123456;

		System.out.println("Using StringBuffer :: " + " " + new StringBuffer(String.valueOf(num)).reverse());
	}


}




