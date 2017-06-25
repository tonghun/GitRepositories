package com.designmode.observer.demo01;

public interface IObservable {

	void addObserver(IObserver observer);

	void removeObserver(IObserver observer);

	void notifyObservers(String message);

}
