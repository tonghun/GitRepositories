package com.javase.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ComparatorTest {

	@Test
	public void test() {
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
		System.out.println("-----------------------");
		Collections.sort(stus, new Comparator<Student>() {
			@Override
			public int compare(Student stu01, Student stu02) {
				// return stu01.getScore() - stu02.getScore();//升序
				return stu02.getScore() - stu01.getScore();// 降序
			}
		});

		System.out.println("排序后");
		for (Student x : stus) {
			System.out.println(x.getName() + "::" + x.getScore());
		}
	}

}
