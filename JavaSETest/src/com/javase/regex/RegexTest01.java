package com.javase.regex;

/**
 * ������ʽ���÷�
 * 
 * @author tonghuo
 *
 */
public class RegexTest01 {
	public static void main(String[] args) {
		String regex = "^1[357]\\d{9}";
		String s01 = "13838690418";
		boolean matching = s01.matches(regex);
		System.out.println("�Ƿ�ƥ��----" + matching);
	}

}
