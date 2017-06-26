package spring.constructor01;

public class User01 {
	private String name;
	private String sex;
	private int age;

	public User01(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("姓名：" + name);
		System.out.println("性别：" + sex);
		System.out.println("年龄：" + age);
	}
}
