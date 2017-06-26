package spring.constructor01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 依赖注入方式：构造器注入
 * 1.JavaBean在定义时必须有带参数的构造方法；
 * 2.在配置文件中为JavaBean的属性赋值时，赋值的顺序必须与构造方法中形参的顺序一致；
 * 3.在配置文件中赋值时可以通过index(从0开始)为构造方法中指定索引位置的参数赋值；
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User01 user = (User01) context.getBean("user02");
		// User user = (User) factory.getBean("user");
		// System.out.println("姓名：" + user.getName());
		// System.out.println("性别：" + user.getSex());
		// System.out.println("年龄：" + user.getAge());
		user.showInfo();
	}

}
