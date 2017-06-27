package com.javase.thread;

/**
 * 线程从堆中读取数据的过程：线程在栈中建立一个堆中变量的副本，修改完毕后再将值同步到堆中。
 * 
 * @author tonghuo
 *
 */
public class VolatileTest {

	public static volatile int count = 0;

	public static void inc() {
		// 这里延迟1毫秒，使得结果明显
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}

		count++;
	}

	public static void main(String[] args) {

		// 同时启动1000个线程，去进行i++计算，看看实际结果

		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					VolatileTest.inc();
				}
			}).start();
		}

		// 这里每次运行的值都有可能不同,可能为1000
		System.out.println("运行结果:Counter.count=" + VolatileTest.count);
	}

}
