package com.designmode.decorator.senior;

public class TrimDecorator extends SomeServiceWrapper {

	public TrimDecorator(ISomeService target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doSome() {
		// TODO Auto-generated method stub
		return super.doSome().trim();
	}

}
