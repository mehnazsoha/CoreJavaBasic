package part1;
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
	public static void main(String[] args) {
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();

		ContinentalTraffic ct = new AustralianTraffic();
		ct.trainSymbol();

		AustralianTraffic at = new AustralianTraffic();
		at.walkOnSymbol();
	}

	@Override
	public void greenGo() {
		System.out.println("green go implementation");
	}

	@Override
	public void redStop() {
		System.out.println("red stop implementation");
	}

	@Override
	public void flashYellow() {
		System.out.println("flash yellow implementation");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Don't move");
	}

	public void walkOnSymbol() {
		System.out.println("Walking");
	}
}