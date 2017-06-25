package com.javase.io;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/**
 * 1.RandomAccessFile是一个文件对象，既可以读，也可以写，还可以根据指针随机访问文件内容。
 * 2.几个重要的概念：文件指针是当前光标所在位置，读写操作开始的地方。seek可以设定指针位置。
 * 
 * @author tonghuo
 *
 */
public class RandomAccessFileTest {

	@Test
	public void test01() throws IOException {
		RandomAccessFile file = new RandomAccessFile("Files/random.txt", "rw");
		System.out.println("pointer-postion=" + file.getFilePointer());// 获取当前指针位置，从0开始
		file.seek(4);
		byte[] buf = new byte[1024];
		int length = file.read(buf);
		String result = new String(buf, 0, length);
		System.out.println("随机指定位置读取的内容：" + result);
		file.seek(file.length());
		file.write("\nnew thing".getBytes());
		file.close();
	}

}
