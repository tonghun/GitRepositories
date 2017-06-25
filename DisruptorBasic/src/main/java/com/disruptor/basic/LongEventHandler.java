package com.disruptor.basic;

import com.lmax.disruptor.EventHandler;

public class LongEventHandler implements EventHandler<LongEvent> {

	public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("当前消费的数据="+event.getValue());
	}

}
