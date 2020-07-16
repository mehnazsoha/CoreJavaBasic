package part2;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 4, b = 7, c = 0;
		try {
//			int k = b / c;
//			System.out.println(k);
			int arr[] = new int[5];
			System.out.println(arr[7]);
		} catch (ArithmeticException ae) {
			// This will catch all arithmetic errors. k=7/0 is an arithmetic error
			System.out.println("I catched arithmetic exception");
		} catch (IndexOutOfBoundsException ibe) {
			// This will catch all index out of bound errors. arr[7] is an out of bound
			// error. Because the array size we declared as 5
			System.out.println("I catched index out of bound exception");
		} catch (Exception e) {
			// This will catch all the general errors.
			System.out.println("I catched exception");
		} finally {
			// This block is executed irrespective of exception thrown or not
			// Even if the script passed or failed, this block will executed
			// This block will only not execute if we forcefully terminate the jvm
			System.out.println("I am in finally block");
		}
	}
}