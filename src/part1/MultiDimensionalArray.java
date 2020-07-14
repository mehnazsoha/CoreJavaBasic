package part1;
public class MultiDimensionalArray {
	public static void main(String[] args) {
		// a[row][column]
		int a[][] = new int[2][3];
		a[0][0] = 12;
		a[0][1] = 22;
		a[0][2] = 52;
		a[1][0] = 27;
		a[1][1] = 512;
		a[1][2] = 529;
		System.out.println("a[1][0] is " + a[1][0]);
		System.out.println("Matrix A,");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		int b[][] = { { 2, 3 }, { 9, 5 } };
		System.out.println("\nb[1][0] is " + b[1][0]);
		System.out.println("Matrix B,");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println("");
		}
	}
}