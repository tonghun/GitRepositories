package com.javase.classtest;

/**
 * 1.一个变量被定义为final类型，如果该变量指向基本数据类型，代表的字面值不可变；
 * 如果指向域模型，那么指向的对象不可变，对象的属性可以变。
 * 2.全局变量被定义为final类型，必须在定义时初始化或者在构造器中初始化。
 * 3.局部变量被定义为final类型，必须在定义时初始化。
 * 
 * @author tonghuo
 *
 */
@SuppressWarnings("unused")
public class FinalClassTest {

	private final User user02;
	private final int a01;

	public FinalClassTest(User user02, int a01) {
		this.user02 = user02;
		this.a01 = a01;
	}

	/* public void init(User user){
	   this.user02=user;
	 }*/
	private static final int a = 3;

	private static final User user01 = new User();

	public static void main(String[] args) {

		user01.setName("123");

	}

}
