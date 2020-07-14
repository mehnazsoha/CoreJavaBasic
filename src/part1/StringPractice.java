package part1;
public class StringPractice {
	public static void main(java.lang.String[] args) {
		// String is one of the pre-built class in java
		/*
		 * How many ways can define a string? 1. String literal 2. By creating object of
		 * a string / with string class. For example: String a = "hello"; // String
		 * literal String b = new String("hello"); // By creating object of a string /
		 * with string class
		 */
		String str = "Payment $100 Paid";
		String str2 = "    Payments $100 Paid";

		System.out.println(str.charAt(8));
		System.out.println(str2.indexOf("$"));
		System.out.println(str2.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(8, 12));
		System.out.println(str.substring(5));
		System.out.println(str2.compareTo(str));
		System.out.println(str.concat(str2));
		System.out.println(str.length());
		System.out.println(str.replace("P", "A"));
		System.out.println(str.trim());

		String arr[] = str2.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}