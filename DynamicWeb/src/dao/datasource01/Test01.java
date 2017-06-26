package dao.datasource01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Book book = new Book();
		book.setName("一千零一夜");
		book.setPrice(100);
		book.setCount(20);
		book.setAuthor("伊朗");
		BookDAO bookDAO = (BookDAO) factory.getBean("bookDAO");
		bookDAO.insert(book);
		System.out.println("数据添加成功");
	}
}
