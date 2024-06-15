package oopspractice;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceWords {

	public static void main(String[] args) {


		String name = "Vinod Kumar Kamara";

		String [] words =  name.split(" ");

		Map<String, Integer> hashmap = new HashMap<>();

		for(String word : words) {
			Integer num = 	hashmap.get(word);

			if(num == null) {
				hashmap.put(word, 1);

			}

			else {
				hashmap.put(word, num+1);
			}
		}

		System.out.println(hashmap);

	}

}
