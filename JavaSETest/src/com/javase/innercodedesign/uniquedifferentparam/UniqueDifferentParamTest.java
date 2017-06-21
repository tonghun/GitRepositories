package com.javase.innercodedesign.uniquedifferentparam;

import org.junit.Test;

public class UniqueDifferentParamTest {

	@Test
	public void testChooseDirection() {
		int result = UniqueDifferentParamModel.chooseDirection(30, true);
		System.out.println("result=" + result);
	}
}
