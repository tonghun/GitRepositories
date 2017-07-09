package com.javase.string;

import org.junit.Test;

/**
 * 判断某个字符串在指定字符串中出现的次数
 * 
 * @author tonghuo
 *
 */
public class OccursCount {

	public int occursCount(String sup, String sub) {
		StringBuilder builder = new StringBuilder(sup);
		int len = sub.length();
		int index = 1;
		int count = 0;
		while (index >= 0) {
			System.out.println("删除之前builder=" + builder);
			index = builder.indexOf(sub);
			System.out.println("index=" + index);
			if (index >= 0) {
				builder.delete(0, index + len);
				System.out.println("删除之后builder=" + builder);
				count++;
			}
			System.out.println();
		}
		return count;
	}

	@Test
	public void test02() {
		String str01 = "bbbb1cccc$1333$39c";
		int count = occursCount(str01, "c");
		System.out.println("总的出现次数count=" + count);
	}
}
