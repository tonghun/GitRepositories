package com.javase.networkCommunication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public void test01() throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		@SuppressWarnings("unused")
		Socket accept = serverSocket.accept();
		serverSocket.close();
	}

}
