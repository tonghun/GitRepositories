package decorator.pacakage01;

public class Test01 {
	public static void main(String[] args) {
		Component c01 = new RealComponent();
		Component c02 = new Decorator03(new Decorator02(c01));
		c02.add();
	}
}
