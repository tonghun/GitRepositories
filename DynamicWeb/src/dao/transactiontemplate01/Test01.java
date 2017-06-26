package dao.transactiontemplate01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		TransactionExample te = (TransactionExample) factory.getBean("transactionExample");
		te.transactionOperation();
		System.out.println("main÷¥––ÕÍ±œ");
	}
}
