package com.nio.test.lock;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

import org.junit.Test;

/**
 * lock好像是自动加上去的
 * 
 * @author tonghuo
 *
 */
public class ChannelLock {

	@Test
	public void test01() throws IOException {
		/*RandomAccessFile raf = new RandomAccessFile("Files/lock.txt", "rw");
		FileChannel channel = raf.getChannel();*/
		FileOutputStream fos = new FileOutputStream("Files/lock.txt");
		FileChannel channel = fos.getChannel();
		// channel.lock();
		FileLock lock = channel.tryLock();
		lock.release();
		System.out.println(lock);
		fos.close();
	}

}
