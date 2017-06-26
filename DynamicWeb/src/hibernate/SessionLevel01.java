package hibernate;

import org.hibernate.Session;

public class SessionLevel01 {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			Book book01 = (Book) session.get(Book.class, 3);
			System.out.println("第一次装载对象" + book01.toString());
			Book book02 = (Book) session.get(Book.class, 3);
			System.out.println("第二次装载对象" + book02.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
