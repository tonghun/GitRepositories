package com.designmode.observer.listener;

/**
 * 遵照功能模块化原则，为事件源的每一种变化定义一个处理方法
 * 
 * @author tonghuo
 *
 */
public interface IListener {

	void handleCreEvent(IEvent event);

	void handleDelEvent(IEvent event);

	void handleUpdEvent(IEvent event);

	void handleRetEvent(IEvent event);

}
