package com.nio.test.mapped;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

import org.junit.Test;

public class MappedByteBufferTest {

	@Test
	public void testMapped() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("Files/mapped.txt", "rw");
		FileChannel channel = raf.getChannel();
		MappedByteBuffer map = channel.map(MapMode.READ_WRITE, 0, channel.size());
		System.out.println("pos=" + map.position());
		System.out.println("lim=" + map.limit());
		System.out.println("cap=" + map.capacity());
		// map.position(map.capacity());
		map.put("new".getBytes());
		map.force();
		channel.close();
		raf.close();
	}

}
