package com.javase.networkCommunication.udp.demo01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.junit.Test;

public class UDPReceiver {

	@Test
	public void testReceive() throws IOException {
		DatagramSocket socket = new DatagramSocket(10001);// 接收方监听的端口，即作为接收的应用程序对应的端口
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket p = new DatagramPacket(buf, buf.length);
			socket.receive(p);
			byte[] data = p.getData();
			String receiveStr = new String(data, 0, p.getLength());
			if (receiveStr.equals("123"))
				break;
			System.out.println(receiveStr);
		}
		socket.close();
	}

}
