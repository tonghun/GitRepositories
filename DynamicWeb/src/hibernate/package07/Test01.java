package hibernate.package07;

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
			Student02 student = new Student02();
			student.setId(7);
			student.setName("С��");
			student.setAge(12);
			student.setSex("Ů");
			student.setSchool("����");
			session.save(student);
			// session.clear();
			Staffer02 staffer = new Staffer02();
			staffer.setId(8);
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
