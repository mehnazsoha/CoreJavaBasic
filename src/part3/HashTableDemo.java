package part3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> hMap = new Hashtable<Integer, String>();
		hMap.put(0, "hello");
		hMap.put(1, "good bye");
		hMap.put(2, "morning");
		hMap.put(3, "evening");
		System.out.println(hMap.get(2));
		hMap.remove(2);
		System.out.println(hMap.get(2));

		Set set = hMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry map = (Map.Entry) iterator.next(); // To separate key and value
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
	}
}