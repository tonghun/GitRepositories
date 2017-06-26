package spring.array;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.map.MapObject;

public class Test01 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArrayObject arr = (ArrayObject) factory.getBean("array");
		arr.showArr();
	}
}
