package part1;
public class OverloadingDemo {
	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		OverloadingDemo overloadingDemo = new OverloadingDemo();
		overloadingDemo.getData(2);
		overloadingDemo.getData("hello");
		overloadingDemo.getData(2, 5);
	}
}