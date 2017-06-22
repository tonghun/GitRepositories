package com.javase.networkCommunication.tcp.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(10004);
      
		Socket client = server.accept();
		String hostAddress = client.getInetAddress().getHostAddress();
		InputStream inputStream = client.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		String content = new String(buf, 0, length,"UTF-8");
		System.out.println(hostAddress + "::" + content);

		OutputStream out = client.getOutputStream();
		out.write("come from server".getBytes());
		System.out.println("服务器即将关闭客户端");
		client.close();// 断开客户端连接，节省资源，同时关闭了输入与输出流
		System.out.println("服务器已关闭客户端");
		server.close();
	}

}
