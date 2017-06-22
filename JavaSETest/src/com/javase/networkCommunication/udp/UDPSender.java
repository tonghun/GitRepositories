package com.javase.networkCommunication.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.junit.Test;

/**
 * 采用UDP协议时， 数据发送方
 * 
 * @author tonghuo
 *
 */
public class UDPSender {

	@Test
	public void testSend() throws IOException {
		DatagramSocket socket = new DatagramSocket();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = buffer.readLine();
			byte[] buf = s.getBytes();
			InetAddress inetAddress = InetAddress.getByName("192.168.146.1");
			DatagramPacket dataPacket = new DatagramPacket(buf, buf.length, inetAddress, 10001);// 目的地ip与端口
			socket.send(dataPacket);
			if (s.equals("123")) {
				break;
			}
		}
		socket.close();
	}

}
