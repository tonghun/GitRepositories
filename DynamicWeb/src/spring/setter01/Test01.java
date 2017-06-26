package spring.setter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 通过Setter方法注入依赖
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user01");
		// User user = (User) factory.getBean("user");
		System.out.println("姓名：" + user.getName());
		System.out.println("性别：" + user.getSex());
		System.out.println("年龄：" + user.getAge());
	}
}
