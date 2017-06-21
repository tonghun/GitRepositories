package com.javase.regex;

import java.util.regex.Pattern;

/**
 * Patternû���ṩ���췽����ͨ���������еľ�̬����matches(String regex,String
 * s)���ж��ַ����Ƿ�ƥ��
 * 
 * @author tonghuo
 *
 */

public class PatternTest {

	public static void main(String[] args) {
		String regex = "^1@\\p{Lower}{3}\\.com$";
		String s = "1@sdd.com";
		boolean matching = Pattern.matches(regex, s);
		System.out.println("�Ƿ�ƥ��----" + matching);
	}

}
