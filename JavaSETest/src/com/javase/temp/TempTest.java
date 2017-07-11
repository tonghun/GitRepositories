package com.javase.temp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TempTest {

	@Test
	public void testErasure() {
		List<String> strList = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();
		System.out.println(strList.getClass() == intList.getClass());
	}
}
