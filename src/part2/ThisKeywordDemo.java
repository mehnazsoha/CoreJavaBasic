package part2;

public class ThisKeywordDemo {
	int a = 2;

	public void getData() {
		int a = 3;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.a + a);
	}

	public static void main(String[] args) {
		ThisKeywordDemo tDemo = new ThisKeywordDemo();
		tDemo.getData();
	}
}