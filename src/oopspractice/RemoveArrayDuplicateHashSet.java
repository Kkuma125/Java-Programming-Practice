package oopspractice;

import java.util.HashSet;

public class RemoveArrayDuplicateHashSet {

	public static void main(String[] args) {

		String arr [] = {"Java", "Java", "C++", "Python", "Python","C#"};

		HashSet<String> map = new HashSet<String>();

		boolean flag = false;

		for(String e : arr) {

			if(map.add(e)==false) {
				System.out.println("Found Duplicate Element :" + e);
				flag = true;

			}
		}	

		if(flag==false) {
			System.out.println("Not Found Duplicate : " + flag);
		}

	}

}
