package com.javase.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.Test;
/**
 * 接收用户键盘输入的关键是输入流，输入流来自键盘，即System.in
 * @author tonghuo
 *
 */
public class BuffferedReaderAndScanner {

	@Test
	public void testBufferedReader() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请用户名：");
		String name = reader.readLine();
		System.out.println("name="+name);
		System.out.println("密码：");
		String password = reader.readLine();
		System.out.println("password="+password);
		reader.close();
	}
	
	@Test
	public void testScanner(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请用户名：");
		String name = scanner.nextLine();
		System.out.println("name="+name);
		System.out.println("密码：");
		String password = scanner.nextLine();
		System.out.println("password="+password);
		scanner.close();
	}

}
