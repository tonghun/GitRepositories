package com.disruptor.basic;

import com.lmax.disruptor.EventFactory;

public class LongEventFactory implements EventFactory<LongEvent> {

	public LongEvent newInstance() {
		// TODO Auto-generated method stub
		return new LongEvent();
	}

}
