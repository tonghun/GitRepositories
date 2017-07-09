package com.javase.classtest.extendsTest;

import java.io.IOException;

@SuppressWarnings("unused")
public class SubClass extends SupClass {

	private String description;

	public SubClass() {
		// TODO Auto-generated constructor stub
		System.out.println("子类无参构造方法");
	}

	public SubClass(String description) {
		super(description);
	}

	@Override
	public void doit02() throws IOException {
		// TODO Auto-generated method stub
		super.doit02();
	}

}
