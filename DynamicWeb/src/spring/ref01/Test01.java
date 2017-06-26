package spring.ref01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.setter01.User;

/*
 * 在一个JavaBean中调用另一个JavaBean：
 * 1.把被调用的JavaBean当做属性来处理；
 * 2.在配置文件中的定义格式：<property name="引用"><ref local="配置名称"></property>
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserRef01 uf = (UserRef01) context.getBean("userRef");
		User user = uf.getUser();
		System.out.println("执行到此01");
		// User user = (User) factory.getBean("user");
		System.out.println("姓名：" + user.getName());
		System.out.println("性别：" + user.getSex());
		System.out.println("年龄：" + user.getAge());
	}

}
