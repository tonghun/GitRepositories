package com.javase.networkCommunication.tcp.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

public class ImgServer {

	@Test
	public void test01() throws IOException {
		ServerSocket serverSocket = new ServerSocket(10007);
		Socket socket = serverSocket.accept();// 线程阻塞，等待请求
		System.out.println("hostAddress=" + socket.getInetAddress().getHostAddress());
		InputStream is = socket.getInputStream();
		FileOutputStream os = new FileOutputStream("Files/2.jpg");
		System.out.println(1);
		byte[] buf = new byte[1024];
		int length = 0;
		System.out.println(2);
		int count = 3;
		while ((length = is.read(buf)) != -1) {
			os.write(buf, 0, length);
			System.out.println(count++);
		}
		os.flush();
		os.close();
		System.out.println("图片上传结束");

		/*PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.write("success");*/
		OutputStream out = socket.getOutputStream();
		out.write("success".getBytes());
		out.flush();
		socket.shutdownOutput();
		System.out.println("响应数据已发出");
		
		serverSocket.close();
	}

}
