package aop.package02;

public class RealSubject01 implements Subject {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("the add of RealSubject01");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("the delete of RealSubject01");
	}

}
