package part1;
public class FirstClass {
	int a = 10;
	static int b = 20;

	public void getData() {
		System.out.println("I am in method");
		// return "hello";
	}
	// Objects are the instances/references of a class

	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		System.out.println(firstClass.a);
		System.out.println("Hi");
		System.out.println("Bye");
		System.out.println(b);
		firstClass.getData();
	}
}
