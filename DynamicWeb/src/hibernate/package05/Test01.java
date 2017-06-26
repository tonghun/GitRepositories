package hibernate.package05;

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
			Student student = new Student();
			student.setName("С��");
			student.setAge(12);
			student.setSex("Ů");
			student.setSchool("����");
			session.save(student);
			Staffer staffer = new Staffer();
			staffer.setName("С��");
			staffer.setAge(100);
			staffer.setSex("��");
			staffer.setCompany("�й��ƶ�");
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
