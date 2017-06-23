package com.javase.networkCommunication.tcp.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ImgClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.146.1", 10007);
		FileInputStream is = new FileInputStream("Files/1.jpg");
		OutputStream os = socket.getOutputStream();
		byte[] buf = new byte[1024];// 先将数据读取到缓冲区，比频繁的从硬盘读取速度快
		int length = 0;
		while ((length = is.read(buf)) != -1) {
			os.write(buf, 0, length);
		}
		os.flush();
		socket.shutdownOutput();// 如果输出流不关闭，服务端对应的输入流会阻塞

		InputStream replyIs = socket.getInputStream();//不会阻塞线程
		byte[] buf01 = new byte[1024];
		int length01 = replyIs.read(buf01);
		String reply = new String(buf01, 0, length01);
		System.out.println(reply);
		
		is.close();
		socket.close();
	}

}
