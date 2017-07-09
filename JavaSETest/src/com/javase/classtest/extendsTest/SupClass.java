package com.javase.classtest.extendsTest;

import java.io.IOException;

public class SupClass {

	private String description;

	public SupClass() {
		System.out.println("父类无参构造方法");
	}

	public SupClass(String description) {
		System.out.println("父类有参构造方法");
		this.description = description;
	}

	public static void doit01() {

	}

	public void doit02() throws IOException {

	}

	public final void doit03() {

	}

	@Override
	public String toString() {
		return "SupClass [description=" + description + "]";
	}

}
