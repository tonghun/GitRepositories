package spring.byName01;

import spring.setter01.User;

public class ByName01 {
	private User user01;

	public User getUser01() {
		return user01;
	}

	public void setUser01(User user01) {
		this.user01 = user01;
	}

	public void showUser() {
		System.out.println("姓名：" + user01.getName());
		System.out.println("性别：" + user01.getSex());
		System.out.println("年龄：" + user01.getAge());
	}
}
