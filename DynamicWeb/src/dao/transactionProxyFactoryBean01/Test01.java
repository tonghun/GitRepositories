package dao.transactionProxyFactoryBean01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("transactionProxyFactoryBean01.xml");
		AddDAO add = (AddDAO) factory.getBean("transactionProxy");// ��CGLIB����ģ���ɵĴ������,�ڸ�ģʽ��Ŀ���౻�����������Ľӿ�
		add.add();
	}
}
