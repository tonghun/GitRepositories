package com.javase.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * is.read(buf):从输入流中读取一定长度的字节，将读取的字节存放到byte数组中，返回实际读取的字节数，无字节可读，返回-1。
 * 如果字节充足，一次读取buf.length个字节；如果字节不足，读取剩余的全部字节。
 * 当字节数量不足时，数组中一部分数据是从输入流中读取的，另一部分不是输入流中的数据，因此不能将数组中的数据全部写入输出流，
 * 应该根据从数组中截取实际读取的部分写入输出流。
 * 
 * @author tonghuo
 *
 */
public class ReadBuf {

	@Test
	public void test01() throws IOException {
		byte[] buf01 = new byte[2];
		buf01[0] = 1;
		buf01[1] = 1;
		ByteArrayInputStream is = new ByteArrayInputStream(buf01);
		byte[] buf02 = new byte[5];
		buf02[0] = 10;
		for (byte x : buf02)
			System.out.println("输入流填充前遍历" + x);
		is.read(buf02);
		System.out.println("---------------------------------");
		for (byte x : buf02)
			System.out.println("输入流填充后遍历" + x);
	}
}
