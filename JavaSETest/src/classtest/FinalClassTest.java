package classtest;

/**
 * 
 * @author tonghuo
 * 
 *         1.一个基本类型的变量被定义为final类型，那么这个变量必须在声明时就赋值，而且只能赋值一次；
 * 
 *         2.一个对象类型的变量被定义为final类型，那么这个变量必须在声明时就指定对象，并且所指向的对象不能改变， 对象的内容可以改变。
 */

public class FinalClassTest {

	@SuppressWarnings("unused")
	private static final int a = 3;

	private static final User user01 = new User();

	public static void main(String[] args) {

		user01.setName("123");

	}

}
