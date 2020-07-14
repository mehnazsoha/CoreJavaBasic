package part1;
public class ParentSum {
	public static void main(String[] args) {
		// This step prints the output
		System.out.println("I started Java learning");

		// Add 2 numbers 2+3=5
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);

		// Output: Sum is 5
		System.out.println("Sum is " + sum);

		// Create object and call the method of that class
		Methods methods = new Methods(); // m
		methods.ValidateHearder(); // classObjectName.mathodName()
	}
}