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
		System.out.println("������" + user.getName());
		System.out.println("�Ա�" + user.getSex());
		System.out.println("���䣺" + user.getAge());
	}
}
