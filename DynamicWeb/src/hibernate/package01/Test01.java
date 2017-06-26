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
			System.out.println("产品名称：" + product.getName());
			System.out.println("产品价格：" + product.getPrice());
			System.out.println("产品制造商：" + product.getFactory().getFactoryName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}

}
