package dao.transactionProxyFactoryBean01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("transactionProxyFactoryBean01.xml");
		AddDAO add = (AddDAO) factory.getBean("transactionProxy");// 以CGLIB代理模生成的代理对象,在该模式下目标类被看做代理对象的接口
		add.add();
	}
}
