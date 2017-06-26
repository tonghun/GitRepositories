package hibernate;

import org.hibernate.Session;

public class AddBook {
	public static void main(String[] args) {
		Session session = null;
		Book book = new Book();
		book.setName("ͼ��01");
		book.setPrice(100);
		book.setBookCount(100);
		book.setAuthor("����");
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("�������ʧ��");
			if (session != null)
				session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			HibernateInitial.closeSession();
		}
	}
}
