package com.javase.networkCommunication.udp.demo02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendRunnable implements Runnable {

	private DatagramSocket socket;

	public SendRunnable() {
		super();
	}

	public SendRunnable(DatagramSocket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				InetAddress address = InetAddress.getByName("192.168.146.1");
				String s = reader.readLine();
				byte[] buf = s.getBytes();
				DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 10002);
				socket.send(packet);
				if (s.equals("123"))
					break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		socket.close();
	}

}
