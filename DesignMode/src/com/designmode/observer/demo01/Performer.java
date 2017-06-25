package com.designmode.observer.demo01;

import java.util.ArrayList;
import java.util.List;

public class Performer implements IObservable {

	private List<IObserver> observers;

	public Performer() {
		super();
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void addObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub
		for (IObserver observer : observers) {
			observer.handleNotify(message);
		}
	}

}
