package test;

/**
 * 
 * @author tonghuo
 * 
 *         1.断点的作用：断点用于使程序调试过程更加可视，程序在指定断点的位置停止，可以分阶段查看程序执行情况；
 * 
 *         2.根据设置断点的元素的类型，断定可以分为几类：行断点、变量断点、方法断点、类断点，在访问或者修改这些断点时，线程挂起；
 * 
 *         3.单步跳过：表示程序一下子执行完该行代码；
 * 
 *         4.单步跳入：针对方法的，表示程序逐行执行方法。
 */
public class BreakpointTest {

	private static int count = 9;

	private static void printSome() {
		System.out.println("a0");
		System.out.println("a1");
		System.out.println("a2");
		System.out.println("a3");
		System.out.println(count);
	}

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);

		printSome();

		System.out.println(2);
		System.out.println(3);
	}

}
