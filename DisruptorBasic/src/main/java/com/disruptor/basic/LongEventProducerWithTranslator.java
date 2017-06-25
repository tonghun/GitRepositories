package com.disruptor.basic;

import java.nio.ByteBuffer;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;

public class LongEventProducerWithTranslator {

	private final RingBuffer<LongEvent> ringBuffer;

	public LongEventProducerWithTranslator(RingBuffer<LongEvent> ringBuffer) {
		this.ringBuffer = ringBuffer;
	}

	private final EventTranslatorOneArg<LongEvent, ByteBuffer> TRANSLATOR = new EventTranslatorOneArg<LongEvent, ByteBuffer>() {
		/**
		 * event：包含有消费数据的对象； sequence：分配给目标对象的RingBuffer空间序号；
		 * bb：包含有将要被存储到目标对象中的数据的容器
		 */
		public void translateTo(LongEvent event, long sequence, ByteBuffer bb) {
			// TODO Auto-generated method stub
			event.setValue(bb.getLong(0));// 将数据存储到目标对象中
		}
	};

	public void onData(ByteBuffer bb) {
		ringBuffer.publishEvent(TRANSLATOR, bb);// 发布，将数据推送给消费者
	}

}
