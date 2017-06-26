package hibernate;

import org.hibernate.Session;

public class LoadBook {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			Book book = (Book) session.load(Book.class, 2);
			System.out.println("ͼ����id:" + book.getId());
			System.out.println("ͼ������name:" + book.getName());
			System.out.println("ͼ��۸�:" + book.getPrice());
			System.out.println("ͼ������:" + book.getBookCount());
			System.out.println("ͼ������:" + book.getAuthor());
		} catch (Exception e) {
			System.out.println("ʹ��load���ض���ʧ��");
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
