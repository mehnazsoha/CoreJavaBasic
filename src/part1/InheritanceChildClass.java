package part1;
public class InheritanceChildClass extends InheritanceParentClass {
	public void engine() {
		System.out.println("new engine");
	}

	public void color() {
		System.out.println(color);
	}

	public void audioSystm() {
		System.out.println("audio child code is implemented");
	}

	public static void main(String[] args) {
		InheritanceChildClass cd = new InheritanceChildClass();
		cd.color();
		cd.brakes();
		cd.engine();
		cd.audioSystm();
	}
}