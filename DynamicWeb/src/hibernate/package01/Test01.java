package hibernate.package01;

import org.hibernate.Session;

import hibernate.HibernateInitial;

public class Test01 {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			Product product = (Product) session.get(Product.class, new Integer(1));
			System.out.println("��Ʒ���ƣ�" + product.getName());
			System.out.println("��Ʒ�۸�" + product.getPrice());
			System.out.println("��Ʒ�����̣�" + product.getFactory().getFactoryName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}

}
