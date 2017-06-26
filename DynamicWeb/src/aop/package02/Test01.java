package aop.package02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop.xml");
		Subject subject01 = (RealSubject01) factory.getBean("real01");
		Subject subject02 = (RealSubject02) factory.getBean("real02");// ?生成的是代理对象，而非真实对象，代理对象不是真实对象的子类，所以这里强制类型转化时类型定位超类

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
