package com.disruptor.basic;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class LongEventTest {

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Test
	public void test01() throws InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		EventFactory<LongEvent> factory = new LongEventFactory();
		int bufferSize = 1024;
		Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(factory, bufferSize, executor, ProducerType.SINGLE,
				new YieldingWaitStrategy());
		disruptor.handleEventsWith(new LongEventHandler());
		disruptor.start();

		RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();
		// LongEventProducer producer = new
		// LongEventProducer(ringBuffer);
		LongEventProducerWithTranslator producer = new LongEventProducerWithTranslator(ringBuffer);
		ByteBuffer bb = ByteBuffer.allocate(8);
		// long startTime = System.currentTimeMillis();
		for (long a = 0; a < 100; a++) {
			bb.putLong(0, a);
			producer.onData(bb);
			/*if (a == 99) {
				long endTime = System.currentTimeMillis();
				System.out.println("useTime=" + (endTime - startTime));
			}*/
			Thread.sleep(100);
		}
		/*long endTime = System.currentTimeMillis();
		System.out.println("useTime=" + (endTime - startTime));*/
		disruptor.shutdown();
		executor.shutdown();
	}

	/*@Test
	public void test02() {
		long startTime = System.currentTimeMillis();
		for (long a = 0; a < 100; a++) {
			System.out.println(a);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("useTime=" + (endTime - startTime));
	}*/

}
