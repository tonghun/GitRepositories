package spring.setter01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ͨ��Setter����ע������
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) context.getBean("user01");
		// User user = (User) factory.getBean("user");
		System.out.println("������" + user.getName());
		System.out.println("�Ա�" + user.getSex());
		System.out.println("���䣺" + user.getAge());
	}
}
