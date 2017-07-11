package com.javase.collections.comparable;

public class Student implements Comparable<Student> {

	private String name;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student stu) {
		return this.score - stu.score;// 操作对象减去参数对象，升序排列，反之降序。
	}

}
