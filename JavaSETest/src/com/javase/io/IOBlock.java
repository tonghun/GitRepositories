package com.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

public class IOBlock {

	@Test
	public void testIOBlock() throws IOException {
		FileInputStream fis = new FileInputStream("Files/block.txt");
		System.out.println("开始读取");
		byte[] buf = new byte[100000000];
		int length = fis.read(buf);
		System.out.println("length=" + length);
		System.out.println("读取完毕");
		fis.close();
	}

	@Test
	public void testNIOBlock() throws IOException {
		FileInputStream fis = new FileInputStream("Files/block.txt");
		FileChannel channel = fis.getChannel();

		ByteBuffer bb = ByteBuffer.allocate(100000000);
		int length = channel.read(bb);
		System.out.println("开始读取");
		System.out.println("length=" + length);
		System.out.println("读取完毕");
		fis.close();
	}

}
