package com.el.javabean;

public class User {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTemp() {
		return " Ù–‘temp";
	}

	public String ps01 = "ps01";
	public static String ps02 = "static ps02";

	public static String doit01() {
		System.out.println("doit01");
		return "static method doit01";
	}

	public String doit02() {
		System.out.println("doit02");
		return "method doit02";
	}
}
