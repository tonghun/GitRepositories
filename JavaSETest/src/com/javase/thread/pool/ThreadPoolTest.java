package com.javase.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(10));*/

		for (int i = 0; i < 100; i++) {
			Mytask mytask = new Mytask(i);
			executor.execute(mytask);
			System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，任务缓存队列中任务数目：" + executor.getQueue().size()
					+ "，已执行完毕的任务数目" + executor.getCompletedTaskCount());
		}

	}

	@Test
	public void test01() {
		// ThreadPoolExecutor executor = (ThreadPoolExecutor)
		// Executors.newCachedThreadPool();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
				new ArrayBlockingQueue<Runnable>(5));

		for (int i = 0; i < 100; i++) {
			Mytask mytask = new Mytask(i);
			executor.execute(mytask);
			System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，任务缓存队列中任务数目：" + executor.getQueue().size()
					+ "，已执行完毕的任务数目" + executor.getCompletedTaskCount());
		}
	}

}

class Mytask implements Runnable {

	private int num;

	public Mytask(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println("正在执行：" + num);
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("task" + num + "执行完毕");
	}

}