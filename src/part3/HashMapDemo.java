package part3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		// This interface takes the values in the form of key value pair

		// Question:
		// Create a hash table and pass the table to set collection and print key and
		// value separately using the iterator.

		// Create a hash table
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(0, "hello");
		hMap.put(1, "good bye");
		hMap.put(2, "morning");
		hMap.put(3, "evening");
		System.out.println(hMap.get(2));
		hMap.remove(2);
		System.out.println(hMap.get(2));

		// Pass the table to set collection and print key and value separately using the
		// iterator.
		Set set = hMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
//			System.out.println(iterator.next()); // This will give an error
			Map.Entry map = (Map.Entry) iterator.next(); // To separate key and value
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
	}
}