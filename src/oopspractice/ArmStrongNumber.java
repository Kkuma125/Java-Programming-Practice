package oopspractice;

public class ArmStrongNumber {



	public static void isArmStrongNumber(int num) {

		int cube = 0;
		int r ;
		int t ;
		t = num;

		while(num > 0) {
			r = num % 10;
			num = num /10 ;
			cube = cube + (r* r*r);

		}

		if(t == cube) {
			System.out.println("This is Arm Strong Number");
		}	
		else {
			System.out.println("This is Not Arm Strong Number");
		}

	}

	public static void main(String[] args) {
		isArmStrongNumber(15);
	}

}
