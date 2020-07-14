package part1;
public class NestedForLoop {
	public static void main(String[] args) {
		System.out.println("\nIncrease");
//		Output:
//		1
//		2	3
//		4	5	6
//		7	8	9	10
		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println("");
		}

		System.out.println("\nReverse");
//		Output:
//		1	2	3	4
//		5	6	7
//		8	9
//		10
		int l = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(l + "\t");
				l++;
			}
			System.out.print("\n");
		}

		System.out.println("\nAnother");
//		Output:
//		1
//		1	2
//		1	2	3
//		1	2	3	4
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}

		System.out.println("\n3 times Multiplication");
//		Output:
//		3
//		6	9
//		12	15	18
//		21	24	27	30
		int m = 3;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(m + "\t");
				m += 3;
			}
			System.out.print("\n");
		}
	}
}