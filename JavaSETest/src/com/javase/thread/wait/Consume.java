package com.javase.thread.wait;

import java.util.List;

@SuppressWarnings("rawtypes")
public class Consume implements Runnable {
	private List container = null;
	private int count;

	public Consume(List lst) {
		this.container = lst;
	}

	public void run() {
		while (true) {
			synchronized (container) {

				if (container.size() == 0) {
					try {
						System.out.println("消费进入等待状态，释放锁");
						container.wait();// 容器为空，放弃锁，等待生产
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				container.remove(0);
				container.notify();
				System.out.println("我吃了" + (++count) + "个");
				System.out.println("消费之后当前产品数目-----" + container.size());
			}
		}
	}
}
