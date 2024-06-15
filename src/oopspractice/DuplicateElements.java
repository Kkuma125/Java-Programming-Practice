package oopspractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		// time complexity O(n2) worst solution because here we are using only 2 for loop

		String names [] = {"Java", "Java", "C++", "Python", "Python","C#"};

		for(int i=0; i<names.length;i++) {

			for(int j=i+1; j<names.length;j++) {

				if(names[i].equals(names[j])) {
					System.out.println("Found the Duplicate ::" + names[i]);

				}

			}
		}

		System.out.println();

		// 2nd Approach Using HashSet Java Collection it stores unique values time complexity is O(n) because here we are using only 1 forloop

		Set<String> map = new HashSet<String>();

		for(String e : names) {
			if(map.add(e)==false) {
				System.out.println("Duplicate Element ::" + e);


			}
		}

		System.out.println();

		// 3rd Approach Using HashMap will store key and value pair time complexity will be O(2n)


		Map<String, Integer> maps  = new HashMap<String, Integer>();

		for(String name : names) {
			Integer count = maps.get(name);
			if(count ==null){
				maps.put(name, 1);
			}
			else {
				maps.put(name, ++count);
			}
		}

		// get the values from this HashMap 

		Set<Entry<String, Integer>> enrtySet = maps.entrySet();

		for(Entry<String,Integer> entry : enrtySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is ::" + entry.getKey());
			}

		}

	}




}	



