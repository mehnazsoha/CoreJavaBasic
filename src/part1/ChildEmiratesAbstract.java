package part1;
public class ChildEmiratesAbstract extends ParentAirCraftAbstract {
	public static void main(String[] args) {
		ChildEmiratesAbstract c = new ChildEmiratesAbstract();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the body");
	}
}
