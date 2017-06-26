package spring.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.list.ListObject;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		MapObject list = (MapObject) factory.getBean("map");
		System.out.println("main");
		list.showMap();
	}

}
