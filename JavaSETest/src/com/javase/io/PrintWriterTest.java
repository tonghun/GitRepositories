package com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.junit.Test;

/**
 * PrintWriter既可以封装字节流，也可以封装字符流，还可以自动刷新与自动换行。
 * 
 * @author tonghuo
 *
 */
public class PrintWriterTest {

	@Test
	public void test01() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("Files/printWriter01.txt", true);//追加文件末尾
		PrintWriter out = new PrintWriter(fos,true);//自动刷新
		out.write("this is contents");
		out.println("今天是个好日子");
		out.println("是，确实是！");
		out.close();
	}

}
