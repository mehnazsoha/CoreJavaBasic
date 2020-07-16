package part3;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Array has a fixed size
		// ArrayList has an dynamic size (can increase by adding and decrease by
		// removing)
		// All the classes which implements list interface can accept duplicate values
		// ArrayList can access and insert any value in any index

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("soha");
		aList.add("java");
		aList.add("java");
		System.out.println(aList);
		aList.add(0, "student");
		System.out.println(aList);

		System.out.println(aList.get(2));
		System.out.println(aList.contains("testing"));
		System.out.println(aList.contains("java"));
		System.out.println(aList.indexOf("soha"));
		System.out.println(aList.isEmpty());
		System.out.println(aList.size());

		aList.remove(1);
		aList.remove("java");
		System.out.println(aList);
		aList.removeAll(aList);
		System.out.println(aList);
		System.out.println(aList.isEmpty());
	}
}