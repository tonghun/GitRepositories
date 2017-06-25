package com.disruptor.basic;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;

public class LongEventProducer {
	// RingBuffer是一种环形数据结构，泛型，需要指明其中存储的数据
	private final RingBuffer<LongEvent> ringBuffer;

	public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
		this.ringBuffer = ringBuffer;
	}

	public void onData(ByteBuffer bb) {
		long sequence = ringBuffer.next();
		try {
			LongEvent event = ringBuffer.get(sequence);
			event.setValue(bb.getLong(0));
		} finally {
			ringBuffer.publish(sequence);
		}
	}

}
