package part3;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		// Print out the unique number and also print how many times the numbers
		// repeated in this array
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		// 4-3, 5-3, 6-2, 9-1
		ArrayList<Integer> aList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			if (!aList.contains(a[i])) {
				aList.add(a[i]);
				c++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						c++;
					}
				}
				System.out.println("Number is " + a[i] + " and repeated " + c + " times");
				if (c == 1) {
					System.out.println(a[i] + " is the unique number");
				}
			}
		}
	}
}