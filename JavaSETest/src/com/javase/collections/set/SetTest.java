package com.javase.collections.set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {

	@Test
	public void test01() {
		Set<String> strs = new HashSet<String>();
		strs.add(null);
		strs.add(null);
		strs.add("a");
		strs.add("a");
		System.out.println(strs.size());
	}

}
