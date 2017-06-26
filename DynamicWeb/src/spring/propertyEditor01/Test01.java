package spring.propertyEditor01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		// System.out.println("main");
		UserInfo user = (UserInfo) factory.getBean("userInfo");
		user.printInfo();
	}
}
