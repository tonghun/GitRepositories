package hibernate.package03;

import org.hibernate.Session;

import hibernate.HibernateInitial;

public class Test01 {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			System.out.println("People to IDcard........");
			People people = (People) session.get(People.class, 1);
			System.out.println("ÐÕÃû£º" + people.getName());
			System.out.println("idcard_code:" + people.getIdcard().getIdcard_code());
			System.out.println("IDcard to People........");
			IDcard idcard = (IDcard) session.get(IDcard.class, 1);
			System.out.println("idcard_code:" + idcard.getIdcard_code());
			 System.out.println("people:"+idcard.getPeople().getName());
			 People people01=(People)session.get(People.class, 3);
			 session.delete(people01);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
