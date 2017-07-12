package com.javase.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {

	public void test01() {
		List<String> strs = new ArrayList<String>();
		Iterator<String> iterator = strs.iterator();
		ListIterator<String> listIterator = strs.listIterator();
	}
}
