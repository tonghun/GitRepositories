package hibernate;

import org.hibernate.Session;

public class DeleteBook {
	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			Book book01 = (Book) session.get(Book.class,  new Integer(25));
			System.out.println(book01.getAuthor());
			session.delete(book01); 
			session.getTransaction().commit();
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
