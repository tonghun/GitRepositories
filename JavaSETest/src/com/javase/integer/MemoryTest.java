package com.javase.integer;

/**
 * 内存不同区域数据共享策略不同
 * 1.栈中数据共享，栈中不存在相同字面值的数据，假如后面的变量指向的字面值与前面变量指向的字面值相同，
 * 那么后面的变量与前面的变量共享一个字面值的内存地址。
 * 2.堆中存放的是new关键字创建的对象与数组，堆中数据不共享，即堆中可以同时存在两个同一类型属性完全相同的两个对象。
 * 
 * 3.在jvm中对于int类型数据，小于128时，在栈中共享，大于等于128时，不共享。
 * 
 * @author tonghuo
 *
 */
public class MemoryTest {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		Integer c = 127;
		Integer d = 127;
		Integer a = 129;
		Integer b = 129;
		System.out.println("s1==s2=" + (s1 == s2));
		System.out.println("a==b=" + (a == b));
		System.out.println("c==d=" + (c == d));
		System.out.println(c.equals(d));
	}

}
