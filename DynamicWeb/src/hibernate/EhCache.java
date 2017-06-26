package hibernate;

import org.hibernate.Session;

public class EhCache {
	public static void main(String[] args) {
		Session session01 = null;
		Session session02 = null;

		try {
			session01 = HibernateInitial.getSession();
			session02 = HibernateInitial.getSession();
			Book book01 = (Book) session01.get(Book.class, 3);
			System.out.println("第一次加载对象");
			Book book02 = (Book) session02.get(Book.class, 3);
			System.out.println("第二次加载对象");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateInitial.closeSession();
		}
	}

}
