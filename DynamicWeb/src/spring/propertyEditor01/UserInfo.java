package spring.propertyEditor01;

import java.util.Date;

public class UserInfo {
	private String name;
	private char sex;
	private int age;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void printInfo() {
		System.out.println("������" + name + "\n�Ա�" + sex + "\n���䣺" + age + "\n�������ڣ�" + date.toLocaleString());
	}
}
