package com.designmode.decorator.senior;

public class UpperDecorator extends SomeServiceWrapper {

	public UpperDecorator(ISomeService target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		return super.doSome().toUpperCase();
	}

}
