package part2;

public class FinalKeywordDemo {
	// If the class is declared as final that means the class can't be extend

	final void getData() {
		// Final keyword used in method to make sure that the method is not overridden
	}

	public static void main(String[] args) {
		// If the value is final then we can't change it anymore.
		// Mainly used for constant values
		// It is also called as constant variables
		final int i = 4;
	}
	// The finally keyword is used in association with a try/catch block and
	// guarantees that a section of code will be executed, even if an exception is
	// thrown
}
