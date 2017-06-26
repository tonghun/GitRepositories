package com.javase.thread.wait;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Product implements Runnable {
	private List container = null;
	private int count;

	public Product(List lst) {
		this.container = lst;
	}

	@SuppressWarnings("unchecked")
	public void run() {
		while (true) {
			synchronized (container) {

				if (container.size() > MultiThread.MAX) {
					// 如果容器超过了最大值，就不要在生产了，等待消费
					try {
						System.out.println("生产线程进入等待状态，释放锁");
						container.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				container.add(new Object());
				container.notify();
				System.out.println("我生产了" + (++count) + "个");
				System.out.println("生产之后当前产品数目-----" + container.size());
			}
		}
	}
}
