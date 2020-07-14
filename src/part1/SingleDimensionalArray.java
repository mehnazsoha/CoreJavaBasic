package part1;
public class SingleDimensionalArray {
	public static void main(String[] args) {
		int a[] = new int[5]; // Declares an array and allocates memory for the values
		a[0] = 2;
		a[1] = 3;
		a[2] = 8;
		a[3] = 5;
		a[4] = 36;
		System.out.println("For a,");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int b[] = { 1, 5, 8, 7, 5, 7, 8, 5, 3 };
		System.out.println("\nFor b,");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
