package oopspractice;

public class MissingNumbers {


	public static void main(String[] args) {


		int [] num = {1,2,3,4,6};

		int sum = 0;

		for(int i =0; i<num.length;i++) {
			sum = sum+num[i];
		}

		System.out.println(sum);


		int sum1 = 0;

		for(int j = 1; j<=6 ; j++) {
			sum1 = sum1 + j;
		}

		System.out.println(sum1);

		System.out.println(sum-sum1);

		System.out.println("**********************");


		int a[] = {1,2,3,4,6};

		int sum2 = 0;

		for(int k=0; k<a.length;k++) {
			sum2 = sum2+num[k];
		}


		System.out.println(sum2);

		int sum3 = 0;

		for(int n=1; n<=6;n++) {
			sum3 = sum3+ n;
		}
		System.out.println(sum3);
		System.out.println(sum2-sum3);
	}	




}
