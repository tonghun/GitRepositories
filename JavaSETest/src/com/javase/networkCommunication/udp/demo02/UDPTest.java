package com.javase.networkCommunication.udp.demo02;

import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPTest {
	public static void main(String[] args) throws SocketException {
		DatagramSocket socket01 = new DatagramSocket();
		DatagramSocket socket02 = new DatagramSocket(10002);
		new Thread(new ReceiveRunnable(socket02)).start();
		new Thread(new SendRunnable(socket01)).start();
	}

}
