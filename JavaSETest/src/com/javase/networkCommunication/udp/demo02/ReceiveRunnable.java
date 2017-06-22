package com.javase.networkCommunication.udp.demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveRunnable implements Runnable {

	private DatagramSocket socket;

	public ReceiveRunnable() {
		super();
	}

	public ReceiveRunnable(DatagramSocket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			try {
				socket.receive(packet);
				String ip = packet.getAddress().getHostAddress();
				byte[] data = packet.getData();
				String receive = new String(data, 0, packet.getLength());
				if (receive.equals("123"))
					break;
				System.out.println(ip+"::"+receive);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
