package part2;

public class SuperChildDemo extends SuperParentDemo {
	String name = "Malibagh";

	public SuperChildDemo() {
		super(); // This should always be at first line in child class constructor
		System.out.println("I am in child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		SuperChildDemo superChildDemo = new SuperChildDemo(); // cd
		superChildDemo.getStringData();
		superChildDemo.getData();
	}
}