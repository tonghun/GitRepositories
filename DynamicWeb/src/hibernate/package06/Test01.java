package hibernate.package06;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;

import hibernate.HibernateInitial;

public class Test01 {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			Student01 student = new Student01();
			student.setName("小米");
			student.setAge(12);
			student.setSex("女");
			student.setSchool("二高");
			session.save(student);
			Staffer01 staffer = new Staffer01();
			staffer.setName("小王");
			staffer.setAge(100);
			staffer.setSex("男");
			staffer.setCompany("中国移动");
			session.save(staffer);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
