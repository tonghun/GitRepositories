package dao.hibernate01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hibernate.Book;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("springHibernate01.xml");
		BookDao bookDao = (BookDao) factory.getBean("bookDao");
		Book book = new Book();
		book.setName("springHibernate");
		book.setPrice(20);
		book.setBookCount(30);
		book.setAuthor("spingHibernate");
		bookDao.add(book);
	}
}
