package test.constant;

public class Test01 {

	public static void doit(Constant c) {
		switch (c) {
		case Constants_A:
			System.out.println("����Constant.Constants_A");
			break;
		case Constants_B:
			System.out.println("����Constant.Constants_B");
			break;
		case Constants_C:
			System.out.println("����Constant.Constants_C");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("main��ʼִ��");
		System.out.println(Constant.Constants_B);
		doit(Constant.Constants_C);
	}    
}
