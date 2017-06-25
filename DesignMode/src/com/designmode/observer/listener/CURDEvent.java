package com.designmode.observer.listener;

public class CURDEvent implements IEvent {

	private IListenable performer;
	private String eventType;

	public CURDEvent(IListenable performer, String eventType) {
		super();
		// TODO Auto-generated constructor stub
		this.performer = performer;
		this.eventType = eventType;
	}

	@Override
	public IListenable getSource() {
		// TODO Auto-generated method stub
		return performer;
	}

	@Override
	public String getEventType() {
		// TODO Auto-generated method stub
		return eventType;
	}

}
