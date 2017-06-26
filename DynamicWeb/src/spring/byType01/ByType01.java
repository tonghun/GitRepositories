package spring.byType01;

import spring.setter01.User;

public class ByType01 {
	private User us;

	public User getUser() {
		return us;
	}

	public void setUser(User us) {
		this.us = us;
	}

	public void showUser() {
		System.out.println("姓名：" + us.getName());
		System.out.println("性别：" + us.getSex());
		System.out.println("年龄：" + us.getAge());
	}
}
