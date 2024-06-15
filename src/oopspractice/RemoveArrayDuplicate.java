package oopspractice;

public class RemoveArrayDuplicate {

	public static void main(String[] args) {

		int arr [] = {4, 4, 1, 2, 3, 6, 6};

		boolean flag = false;

		for(int i=0; i<arr.length; i++) {

			for(int j = i+1; j<arr.length; j++) {

				if(arr[i] == arr[j]) {
					System.out.println("Found the Duplicate Element : " + arr[i]);
					flag= true;
				}

			}

		}
		if(flag==false) {
			System.out.println("Duplicate Element Not Found");
		}

	}


}