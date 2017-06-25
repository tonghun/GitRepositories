package com.designmode.observer.listener;

/**
 * 具有哪些属性与行为 ？事件的两个基本行为：获取事件源、获取事件类型
 * 
 * @author tonghuo
 *
 */
public interface IEvent {

	String CRE_EVENT = "create event";
	String DEL_EVENT = "delete event";
	String UPD_EVENT = "update event";
	String RET_EVENT = "retrieve event";

	IListenable getSource();// 通过实践获取事件源

	String getEventType();// 获取事件类型
}
