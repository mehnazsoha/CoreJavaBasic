package part2;

public class StaticVar {
	String name; // Instance variables
	String address; // Instance variables
	static String city; // Class variables
	int i = 0;
	static int j;

	// Static block to declare the values
	static {
		city = "Bangalore";
		j = 0;
	}

	StaticVar(String name, String address) { // Local variables
		this.name = name;
		this.address = address;
		i++;
		System.out.println("If not static " + i);
		j++;
		System.out.println("If static " + j);
	}

	public void getAddress() {
		System.out.println(address + ", " + city);
	}

	// Static method will only accepts the static variables
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar sVar = new StaticVar("Bob", "Marthali");
		StaticVar sVar1 = new StaticVar("Ram", "Jayanagar");
		StaticVar sVar2 = new StaticVar("Krishna", "Jayanagar");
		sVar.getAddress();
		sVar1.getAddress();
		StaticVar.getCity();
		StaticVar.j = 4;
		sVar2.address = "abc";
	}
}