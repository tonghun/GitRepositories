package hibernate;

import org.hibernate.Session;

public class GetBook {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			Book book = (Book) session.get(Book.class, new Integer(3));
			System.out.println("图书编号id:" + book.getId());
			System.out.println("图书名称name:" + book.getName());
			System.out.println("图书价格:" + book.getPrice());
			System.out.println("图书数量:" + book.getBookCount());
			System.out.println("图书作者:" + book.getAuthor());
		} catch (Exception e) {
			System.out.println("使用get方法查询失败");
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
