package test;

import java.io.File;

/**
 * 利用Scanner可以快速地从字符串中提取需要的内容
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
		System.out.println("res前:" + res);
		if (res.indexOf("\\") != -1) {
			res = res.substring(1, res.length() - 1);
			System.out.println("if执行");
		}
		System.out.println("res后:" + res);
		
		System.out.println("File.separator----"+File.separator);
	}

}
