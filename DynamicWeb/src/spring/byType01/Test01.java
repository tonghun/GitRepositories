package spring.byType01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.setter01.User;

/*
 * ͨ�������Զ�װ��JavaBean���ñ�װ�ص�JavaBean�����������ļ������ã�Spring�������ļ���Ѱ���������һ�µ�JavaBean��װ�أ�
 * 1.���������Զ�װ��ʱ�������ļ���ͬһ���JavaBeanֻ����һ���������޷�װ�أ�
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ByType01 uf = (ByType01) context.getBean("byType01");
		User user = uf.getUser();
		System.out.println("ͨ�������Զ�װ��bean");
		// User user = (User) factory.getBean("user");
		System.out.println("������" + user.getName());
		System.out.println("�Ա�" + user.getSex());
		System.out.println("���䣺" + user.getAge());
	}

}
