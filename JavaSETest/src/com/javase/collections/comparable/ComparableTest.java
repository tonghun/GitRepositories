package com.javase.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ComparableTest {

	@Test
	public void testComparable() {
		List<Student> stus = new ArrayList<Student>();
		Student zhangsan = new Student("zhangsan", 100);
		Student lisi = new Student("lisi", 90);
		Student wanger = new Student("wanger", 95);
		stus.add(zhangsan);
		stus.add(lisi);
		stus.add(wanger);
		System.out.println("排序前");
		for (Student x : stus) {
			System.out.println(x.getName() + "::" + x.getScore());
		}
		System.out.println("排序后");
		Collections.sort(stus);
		for (Student x : stus) {
			System.out.println(x.getName() + "::" + x.getScore());
		}
	}

}
