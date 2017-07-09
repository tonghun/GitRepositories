package com.javase.enumTest;

/**
 * 枚举提供了一种定义常量的方式，主要用于定义取值固定有限、可列举的变量，该变量通常用作方法的形参
 * 
 * @author tonghuo
 *
 */
public enum MyConstants {

	Constants_A(1), Constants_B(2), Constants_C("this is Constants_C"), Constants_D, Constants_E(2);

	private int sequence;
	private String description;

	private MyConstants() {

	}

	private MyConstants(int sequence) {
		this.sequence = sequence;
	}

	private MyConstants(String description) {
		this.description = description;
	}

	public int getSequence() {
		return sequence;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println(this.sequence + this.description);
	}

	@Override
	public String toString() {
		return String.valueOf(this.sequence);
	}

	public boolean equals(MyConstants c) {
		if (this.sequence == c.sequence)
			return true;
		return false;
	}
}