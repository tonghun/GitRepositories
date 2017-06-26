package decorator.pacakage01;

public class Decorator02 extends Decorator01 {

	private Component com;

	public Decorator02() {

	}

	public Decorator02(Component com) {
		super(com);
		// this.com = com;
	}

	public void delete() {
		System.out.println("the delete of Decorator02");
	}

	public void add() {
		super.add();
		delete();
	}
}
