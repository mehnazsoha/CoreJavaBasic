package part2;

public class ConstructorDemo {
	// Constructor is a block of code and called when an object is created
	// Have no return type
	// Name of the constructor should be as same as its class name
	// Compiler will call default constructor, if no constructor is defined in class
	// Default constructor is also called as implicit constructor
	// Two types of constructor. 1. Default 2. Parameterized

	public ConstructorDemo() {
		// This is a default constructor
		System.out.println("I am in the default constructor");
	}

	public ConstructorDemo(int a, int b) {
		// This is a parameterized constructor
		System.out.println("I am in the parameterized constructor");
		System.out.println(a + b);
	}

	public ConstructorDemo(String str) {
		// This is a parameterized constructor
		System.out.println(str);
	}

	public void getData() {
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {
		// If we don't pass any parameter, it will pick the default constructor
		ConstructorDemo constructorDemo = new ConstructorDemo();

		// If we pass the parameter, it will pick the parameterized constructor
		ConstructorDemo constructorDemo2 = new ConstructorDemo(2, 5);
		ConstructorDemo constructorDemo3 = new ConstructorDemo("hello");
	}
}