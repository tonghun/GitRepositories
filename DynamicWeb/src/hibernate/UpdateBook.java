package hibernate;

import org.hibernate.Session;

public class UpdateBook {

	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			Book book = (Book) session.get(Book.class, new Integer(3));
			book.setName("ÖÐ¹úÍ¼Êé");
			book.setBookCount(600);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
