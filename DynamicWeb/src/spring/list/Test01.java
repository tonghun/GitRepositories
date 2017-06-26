package spring.list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ListObject list = (ListObject) factory.getBean("list");
		System.out.println("main");
		list.showList();
	}
}
