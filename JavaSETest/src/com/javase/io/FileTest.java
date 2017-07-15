package com.javase.io;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTest {

	/**
	 * 通过代码创建文件时，目录必须存在，不存在，抛出异常
	 * 
	 * @throws IOException
	 */
	@Test
	public void testCreatNewFile() throws IOException {
		File file = new File("d:/Test/test.txt");
		boolean exists = file.exists();
		System.out.println("文件是否存在：" + exists);
		if (!exists) {
			file.createNewFile();
		}
	}

	@Test
	public void testMkdir() {
		File file = new File("d:/1/a");
		if (!file.exists()) {
			System.out.println(file.mkdir());
		}
	}

	@Test
	public void testFileName() {
		File file = new File("d:/1");
		boolean directory = file.isDirectory();
		System.out.println(file.getName());
		System.out.println(directory);
	}

}
