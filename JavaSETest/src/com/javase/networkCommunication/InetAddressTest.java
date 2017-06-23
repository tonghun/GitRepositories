package com.javase.networkCommunication;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.Test;

/**
 * InetAddress是一个从IP角度反映网络上计算机的对象
 * 
 * @author tonghuo
 *
 */
public class InetAddressTest {

	@Test
	public void test01() throws UnknownHostException {
		InetAddress localHost = InetAddress.getLocalHost();
		byte[] address = localHost.getAddress();
		for (byte x : address) {
			System.out.println("x=" + x);
		}
		System.out.println("hostName=" + localHost.getHostName());

		InetAddress ip = InetAddress.getByName("www.baidu.com");
		System.out.println("ip=" + ip);

		InetAddress localIp = InetAddress.getByName("localhost");
		System.out.println("localIp=" + localIp);
	}

}
