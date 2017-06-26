package spring.ref01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.setter01.User;

/*
 * ��һ��JavaBean�е�����һ��JavaBean��
 * 1.�ѱ����õ�JavaBean��������������
 * 2.�������ļ��еĶ����ʽ��<property name="����"><ref local="��������"></property>
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserRef01 uf = (UserRef01) context.getBean("userRef");
		User user = uf.getUser();
		System.out.println("ִ�е���01");
		// User user = (User) factory.getBean("user");
		System.out.println("������" + user.getName());
		System.out.println("�Ա�" + user.getSex());
		System.out.println("���䣺" + user.getAge());
	}

}
