package com.designmode.decorator.senior;

public class SomeServiceWrapper implements ISomeService {

	private ISomeService target;

	public SomeServiceWrapper(ISomeService target) {
		super();
		this.target = target;
	}

	@Override
	public String doSome() {
		return target.doSome();
	}

}
