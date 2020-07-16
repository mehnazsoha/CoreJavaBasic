package part3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		// Set interface doesn't accept duplicate values
		// There is no guarantee that elements store in sequential order
		// They may store in random order
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("usa");
		hSet.add("uk");
		hSet.add("india");
		hSet.add("he");
		hSet.add("she");

		hSet.add("india");
		System.out.println(hSet);

//		System.out.println(hSet.remove("uk"));
		System.out.println(hSet.isEmpty());
		System.out.println(hSet.size());

		//
		Iterator<String> iterator = hSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}