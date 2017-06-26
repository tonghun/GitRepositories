package hibernate.package02;

import java.util.Iterator;
import java.util.Set;
import org.hibernate.Session;

import hibernate.HibernateInitial;
//import hibernate.package01.Product;

public class Test01 {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			Factory factory = (Factory) session.get(Factory.class, 2);
			System.out.println("生产商：" + factory.getFactoryName());
			Set<Product> products = factory.getProducts();
			Iterator<Product> it = products.iterator();
			while (it.hasNext()) {
				Product product = (Product) it.next();
				System.out.println("产品名称：" + product.getName());
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("出现异常");
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}

}
