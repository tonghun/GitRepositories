package com.javase.temp;

import java.util.ArrayList;

public class TempTest<T> {

	/*public static T some = "str";
	
	public static T test01(T t) {
	}*/

	public static <K> void doSome01(K t) {
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	public void doSome01() {
		// T[] arr = new T[12];//数组不可以采用泛型定义
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add("str");
		ArrayList<String> array = new ArrayList<String>();
		// list = array;//List<Object>与List<String>不能进行类型转化
		ArrayList array2 = new ArrayList();
		ArrayList<?> array3;
		array2 = list;
		array3 = list;
	}

}
