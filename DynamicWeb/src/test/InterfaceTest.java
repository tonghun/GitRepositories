package test;

public interface InterfaceTest {

	void doit();// 接口中只能存在抽象方法，不能存在具体方法，即方法不能有方法体，
				// 所以没有区分的必要，用作方法修饰的public abstract可以省略。

	public abstract void doit01();

}
