package com.javase.networkCommunication;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

/**
 * 暂不成功
 * 
 * @author tonghuo
 *
 */
public class SimulateServer {

	@Test
	public void testSimulateServer() throws IOException {
		while (true) {
			ServerSocket serverSocket = new ServerSocket(11000);
			Socket socket = serverSocket.accept();
			System.out.println(socket.getInetAddress().getHostAddress());
			OutputStream os = socket.getOutputStream();
			os.write("come from Server".getBytes());
			/*PrintWriter out = new PrintWriter(os);
			out.write("come from Server");*/
			socket.shutdownOutput();
			serverSocket.close();
		}
	}

}
