package test.variable;

/**
 * 
 * @author tonghuo
 *
 *         1.全局变量未初始化，可以使用，系统自动为全局变量赋值，为数字型变量赋值0，为对象的引用变量赋值null;
 * 
 *         2.局部变量未初始化，不可使用；
 * 
 *         3.同时为多个变量赋值时，只有最后被一个变量被赋值。
 */
public class VariableStatement {

	private static int a, b, c = 9;

	public static void main(String[] args) {
		System.out.println("a----" + a);
		System.out.println("b----" + b);
		System.out.println("c----" + c);
	}

}
