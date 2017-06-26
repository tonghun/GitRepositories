package com.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

public class WriteCover {

	/**
	 * 使用输出流（FileOutputStream FileWriter）向文件中写入内容时，如果选择不将写入的文件追加到文件末尾，
	 * 写入时会先清空文件，然后写入，并不是从开始覆盖，未覆盖的保留。
	 * 
	 *
	 */
	@Test
	public void testWriteCover() throws IOException {
		FileOutputStream fos = new FileOutputStream("Files/cover.txt");
		fos.write("new".getBytes());
		fos.flush();
		fos.close();
	}

	/**
	 * 使用RandomAccessFile向文件中写入内容时，从头开始覆盖，未覆盖的保留。
	 * 
	 * @throws IOException
	 */
	@Test
	public void testRandomAccessFile() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("Files/cover.txt", "rw");
		raf.write("new".getBytes());
		raf.close();
	}

	/**
	 * 基于RandomAccessFile创建的Channel向文件输出内容时，覆盖写入。
	 * 
	 * @throws IOException
	 */
	@Test
	public void testChannelBasedRAF() throws IOException {
		// FileInputStream fis = new
		// FileInputStream("Files/cover.txt");
		RandomAccessFile fis = new RandomAccessFile("Files/cover.txt", "rw");
		FileChannel channel = fis.getChannel();
		long size = channel.size();
		System.out.println("size=" + size);
		channel.position(size);
		System.out.println("position=" + channel.position());

		byte[] buf01 = "new".getBytes();
		ByteBuffer bb = ByteBuffer.wrap(buf01);
		channel.write(bb);
		channel.close();
		fis.close();
	}

	/**
	 * 基于FileOutStream的Channel向文件写入内容时，清空写入
	 * 
	 * @throws IOException
	 */
	@Test
	public void testChannelBasedFOS() throws IOException {
		FileOutputStream fos = new FileOutputStream("Files/cover.txt");
		FileChannel channel = fos.getChannel();

		byte[] buf01 = "new".getBytes();
		ByteBuffer bb = ByteBuffer.wrap(buf01);
		channel.write(bb);
		channel.close();
		fos.close();
	}
}
