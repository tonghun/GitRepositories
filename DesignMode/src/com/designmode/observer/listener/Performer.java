package com.designmode.observer.listener;

public class Performer implements IListenable {

	private IListener listener;

	@Override
	public void setListener(IListener listener) {
		// TODO Auto-generated method stub
		this.listener = listener;
	}

	/*@Override
	public void triggleListener(IEvent event) {
		// TODO Auto-generated method stub
		String eventType = event.getEventType();
		if (eventType.equals("create event")) {
			listener.handleCreEvent(event);
		} else if (eventType.equals("update event")) {
			listener.handleUpdEvent(event);
		} else if (eventType.equals("delete event")) {
			listener.handleDelEvent(event);
		} else if (eventType.equals("retrieve event")) {
			listener.handleRetEvent(event);
		}
	}*/

	/**
	 * 当调用某方法时，发生对应类型事件，触发监听器，监听器调用对应的方法
	 */
	public void create() {
		CURDEvent event = new CURDEvent(this, IEvent.CRE_EVENT);
		// triggleListener(event);
		listener.handleCreEvent(event);
	}

	public void update() {
		CURDEvent event = new CURDEvent(this, IEvent.UPD_EVENT);
		listener.handleUpdEvent(event);
	}

	public void delete() {
		CURDEvent event = new CURDEvent(this, IEvent.DEL_EVENT);
		listener.handleDelEvent(event);
	}

	public void retrieve() {
		CURDEvent event = new CURDEvent(this, IEvent.RET_EVENT);
		listener.handleRetEvent(event);
	}

}
