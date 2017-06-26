package spring.constructor01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * ����ע�뷽ʽ��������ע��
 * 1.JavaBean�ڶ���ʱ�����д������Ĺ��췽����
 * 2.�������ļ���ΪJavaBean�����Ը�ֵʱ����ֵ��˳������빹�췽�����βε�˳��һ�£�
 * 3.�������ļ��и�ֵʱ����ͨ��index(��0��ʼ)Ϊ���췽����ָ������λ�õĲ�����ֵ��
 */
public class Test01 {
	public static void main(String[] args) {
		// Resource resource = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User01 user = (User01) context.getBean("user02");
		// User user = (User) factory.getBean("user");
		// System.out.println("������" + user.getName());
		// System.out.println("�Ա�" + user.getSex());
		// System.out.println("���䣺" + user.getAge());
		user.showInfo();
	}

}
