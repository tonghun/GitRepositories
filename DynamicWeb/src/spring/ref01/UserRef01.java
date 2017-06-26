package spring.ref01;

import spring.setter01.User;

public class UserRef01 {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void showUser() {
		System.out.println("姓名：" + user.getName());
		System.out.println("性别：" + user.getSex());
		System.out.println("年龄：" + user.getAge());
	}
}
