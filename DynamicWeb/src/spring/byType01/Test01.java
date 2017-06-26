package spring.byType01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.setter01.User;

/*
 * 通过类型自动装载JavaBean：该被装载的JavaBean必须在配置文件中配置，Spring从配置文件中寻找与该类型一致的JavaBean并装载；
 * 1.根据类型自动装载时，配置文件中同一类的JavaBean只能有一个，否则无法装载；
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ByType01 uf = (ByType01) context.getBean("byType01");
		User user = uf.getUser();
		System.out.println("通过类型自动装载bean");
		// User user = (User) factory.getBean("user");
		System.out.println("姓名：" + user.getName());
		System.out.println("性别：" + user.getSex());
		System.out.println("年龄：" + user.getAge());
	}

}
