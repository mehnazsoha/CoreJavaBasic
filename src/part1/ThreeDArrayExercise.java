package part1;
public class ThreeDArrayExercise {
	public static void main(String[] args) {
		// Interview question
		// Print the minimum and maximum value from the following 3*3 matrix
		// Print the maximum value of the column where the minimum value is exits
		// 2 4 5
		// 3 4 7
		// 1 2 9
		int a[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		// Print the minimum and maximum value from the 3*3 matrix
		int min = a[0][0];
		int max = a[0][0];
		int minCol = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minCol = j;
				}
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);

		// Print the maximum value of the column where the minimum value is exits
		int k = 0;
		int maxInCol = a[0][minCol];
		while (k < 3) {
			if (a[k][minCol] > maxInCol) {
				maxInCol = a[k][minCol];
			}
			k++;
		}
		System.out.println("Maximum of the column is " + maxInCol);
	}
}
