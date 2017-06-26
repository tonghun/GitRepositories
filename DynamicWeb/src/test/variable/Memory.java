package test.variable;

/**
 * 
 * @author tonghuo
 *
 *         1.变量与变量之间赋值，就是把一个变量的引用传递给另一个变零，从此两个变量指向同一个对象；
 */
public class Memory {

	private int a = 0;// 实例变量存储在堆内存的对象中，而堆是所有线程共享的，所以实例变量是所有线程共享的，因此存在线程安全问题。

	private static int b = 0;// 静态变量在类加载时创建并初始化，存放在方法区，因为方法区是所有线程共享的，所以静态变量存在线程安全问题。

	private void doit() {
		int a = 0;// 局部变量存储在栈中，栈内部的数据可以在内部共享，当创建变量a时，先检索栈中是否存在0，存在则将该变量指向0，如果不存在则在栈中开辟一个空间存放0；
	}

	public static void main(String[] args) {
		String s01 = new String("123");
		String s02 = null;

		System.out.println("s01==s02" + s01 == s02);
		s02 = s01;
		System.out.println("s01----" + s01);
		System.out.println("s02----" + s02);
		System.out.println("s01==s02" + s01 == s02);

		TestClass obj01 = new TestClass("A");
		TestClass obj02 = new TestClass("B");
		System.out.println("obj01----" + obj01);
		System.out.println("obj02----" + obj02);

		TestClass obj03 = obj01;
		obj02 = obj01;
		System.out.println("obj03----" + obj03);
		System.out.println("obj02----" + obj02);

		Class obj01C = obj01.getClass();
		String name01 = obj01C.getName();
		System.out.println("obj01C----className" + name01);

		Class obj02C = obj02.getClass();
		String name02 = obj02C.getName();
		System.out.println("obj02C----className" + name02);

		System.out.println("obj01==obj02----" + (obj01 == obj02));
	}

}

class TestClass {
	public TestClass(String name) {

	}

}