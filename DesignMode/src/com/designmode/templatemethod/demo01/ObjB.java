package com.designmode.templatemethod.demo01;

public class ObjB extends Model {
	private String name = null;

	public ObjB(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void doit01() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "----doit01方法执行");
	}

	@Override
	void doit02() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "----doit02方法执行");
	}

	@Override
	void doit03() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "----doit03方法执行");
	}

}
