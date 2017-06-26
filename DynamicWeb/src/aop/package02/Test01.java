package aop.package02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop.xml");
		Subject subject01 = (RealSubject01) factory.getBean("real01");
		Subject subject02 = (RealSubject02) factory.getBean("real02");// ?���ɵ��Ǵ�����󣬶�����ʵ���󣬴����������ʵ��������࣬��������ǿ������ת��ʱ���Ͷ�λ����

		// System.out.println("main");
		subject01.add();
		System.out.println();
		subject01.delete();

		System.out.println();

		subject02.add();
		System.out.println();
		subject02.delete();
	}
}
