package com.xml.beans;

public class BaseXMLBean {
	private Integer id;
	private String name;
	private int age;

	public BaseXMLBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "BaseXMLBean [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
