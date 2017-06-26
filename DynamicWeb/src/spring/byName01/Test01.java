package spring.byName01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.setter01.User;

/*
 * 通过名称自动装载JavaBean：该被装载的JavaBean必须在配置文件中配置，引用名称与配置名称相同
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ByName01 uf = (ByName01) context.getBean("byName01");
		User user = uf.getUser01();
		System.out.println("通过名称自动装载bean");
		// User user = (User) factory.getBean("user");
		System.out.println("姓名：" + user.getName());
		System.out.println("性别：" + user.getSex());
		System.out.println("年龄：" + user.getAge());
	}

}
