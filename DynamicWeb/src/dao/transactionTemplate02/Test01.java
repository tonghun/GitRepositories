package dao.transactionTemplate02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("transactionTemplate02.xml");
		TransactionExample te = (TransactionExample) factory.getBean("transactionExample");
		te.execute();
	}

}
