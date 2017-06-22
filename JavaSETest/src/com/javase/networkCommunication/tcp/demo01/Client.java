package com.javase.networkCommunication.tcp.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Socket socket = new Socket("192.168.146.1", 10004);
		OutputStream out = socket.getOutputStream();
		out.write("来自客户端的信息".getBytes());
		
		Thread.sleep(10000);
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		String content = new String(buf, 0, length);
		System.out.println(content);
		System.out.println("socket关闭前="+socket);
		socket.close();//关闭不是销毁对象，对象为null，而是使对象失去网络通信的功能，同时关闭输入与输出流
		System.out.println("socket关闭后="+socket);
	}

}
