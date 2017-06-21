package com.javase.regex;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * ��������ʽ�п���ʹ�á�|�������Ӷ�����ʽ��ʽ��ֻҪ��������һ�֣���Ϊtrue��
 * 
 * @author tonghuo
 *
 */
public class Or {
	@Test
	public void testOr() {
		String regex = "^a.*|^b.*";
		String target = "bbc";
		boolean matches = Pattern.matches(regex, target);
		System.out.println(matches);
	}

}
