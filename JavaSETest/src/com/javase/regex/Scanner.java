package com.javase.regex;

import java.io.File;

/**
 * ����Scanner���Կ��ٵش��ַ�������ȡ��Ҫ������
 * 
 * @author tonghuo
 *
 */
public class Scanner {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String target = "filename='E:\\123.txt'";
		System.out.println("target:" + target);
		String reg = ".*filename='*[A-Z]*:*";
		System.out.println("reg:" + reg);
		java.util.Scanner sc = new java.util.Scanner(target).useDelimiter(reg);
		String res = sc.next();
		System.out.println("resǰ:" + res);
		if (res.indexOf("\\") != -1) {
			res = res.substring(1, res.length() - 1);
			System.out.println("ifִ��");
		}
		System.out.println("res��:" + res);
		
		System.out.println("File.separator----"+File.separator);
	}

}
