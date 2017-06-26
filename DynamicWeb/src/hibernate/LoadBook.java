package hibernate;

import org.hibernate.Session;

public class LoadBook {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			Book book = (Book) session.load(Book.class, 2);
			System.out.println("图书编号id:" + book.getId());
			System.out.println("图书名称name:" + book.getName());
			System.out.println("图书价格:" + book.getPrice());
			System.out.println("图书数量:" + book.getBookCount());
			System.out.println("图书作者:" + book.getAuthor());
		} catch (Exception e) {
			System.out.println("使用load加载对象失败");
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
