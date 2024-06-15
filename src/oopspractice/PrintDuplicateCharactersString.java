package oopspractice;

public class PrintDuplicateCharactersString {


	public static void main(String[] args) {


		String Name = "Automation Tester";

		System.out.println("Before Value is : " + Name);

		int count = 0;

		char [] chars = Name.toCharArray();

		for(int i=0; i<Name.length(); i++) {
			for(int j= i+1; j<Name.length(); j++) {

				if(chars[i] == chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}

			}

		}

		System.out.println(count);


		String name = "Test Automation Engineer";
		System.out.println("Before Printing Value is ::" + name);

		int count1=0;

		char [] names = name.toCharArray();

		for(int i=0; i<name.length();i++) {
			for(int k=i+1; k<name.length();k++) {
				if(names[i]==names[k]) {
					System.out.println("Duplicate Charachter Found ::" + names[i]);
					count1++;
					break;
				}

			}
		}
		
		System.out.println(count1);

	}





}
