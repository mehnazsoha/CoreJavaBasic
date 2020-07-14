package part1;
public class Palindrome {
	public static void main(String[] args) {
		String str = "soha";
		String str2 = ""; // empty string

		// String length is 4 and the index is 0,1,2,3. So need to add -1
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}