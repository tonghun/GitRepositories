package com.nio.test.byteBuffer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

public class ByteBufferTest01 {

	/**
	 * ByteBuffer.flip():通过调整position与limit的值为读写操作创造环境。
	 * 
	 * @throws IOException
	 */
	@Test
	public void testFlip() throws IOException {
		ByteBuffer bb = ByteBuffer.allocate(10);
		bb.put((byte) 1);// 将数据写入当前位置，将位置向前移动一个数据单位
		bb.put((byte) 2);
		bb.put((byte) 3);
		bb.flip();// pos=0,lim=position
		int limit = bb.limit();
		System.out.println("limit=" + limit);
		for (int i = 0; i < limit; i++) {
			System.out.println("[" + i + "]" + "=" + bb.get());// 获取当前位置的值，将位置向前移动一个数据单位
		}
		System.out.println("添加数据前pos=" + bb.position());
		bb.limit(4);
		bb.put((byte) 4);
		System.out.println("添加数据后pos=" + bb.position());
		bb.flip();
		System.out.println("添加数据后limit=" + bb.limit());
		for (int i = 0; i < bb.limit(); i++) {
			System.out.println("[" + i + "]" + "=" + bb.get(i));// 获取当前位置的值，将位置向前移动一个数据单位
		}
		System.out.println("cap=" + bb.capacity());
	}

	/**
	 * 1.ByteBuffer.hasRemaining():用于判断当前位置与limit之间是否还有元素，limit处的元素取不到。
	 * 2.clear():并非清空缓冲区中的数据，而是还原position与limit，即position=0，limit=capacity。
	 * 
	 * @throws IOException
	 */
	@Test
	public void test01() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("Files/01.txt", "rw");// 可以随机读写文件的对象
		FileChannel inChannel = aFile.getChannel();// 获取通道
		ByteBuffer buf = ByteBuffer.allocate(48);// 创建一个容量为48个字节的字节缓冲区
		int bytesRead = inChannel.read(buf);// 从通道中读取数据存放到byte缓冲区中，返回实际读取的字节数
		while (bytesRead != -1) {
			buf.flip();// 读写转换
			while (buf.hasRemaining()) {
				System.out.print((char) buf.get());
			}
			buf.clear();// 还原位置与上限
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}

	/**
	 * Channel具有索引，可以指定位置读取数据
	 * 
	 * @throws IOException
	 */
	@Test
	public void test03() throws IOException {
		RandomAccessFile file = new RandomAccessFile("Files/02.txt", "rw");
		FileChannel channel = file.getChannel();// 基于块操作
		// channel.position(channel.size());
		// channel.truncate(4000);//截取指定长度的内容，删除其余部分
		
		ByteBuffer dst = ByteBuffer.allocate(48);
		int length = channel.read(dst, 4);
		byte[] buf = dst.array();
		String result = new String(buf, 0, length);
		System.out.println("result=" + result);
		/*byte[] array = "this is 02 file!".getBytes();
		ByteBuffer bb = ByteBuffer.wrap(array);
		channel.write(bb);*/
		channel.close();
		file.close();
	}

}
