package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * ���麯����group by
 */
public class Test07 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("�����ѯ");
			String hql = " select emp.sex,count(*) from Employee emp group by sex";
			Query q = session.createQuery(hql);
			// q.setParameter(0, "��");
			empList = q.list();
			showList(empList);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}

	public static void showList(List list) {
		Iterator it = list.iterator();
		System.out.println("������Ԫ�ظ�����" + list.size());
		while (it.hasNext()) {
			// Object emp = it.next();
			// Employee emp = (Employee) it.next();
			// System.out.print("ƽ����ţ�" + emp + " ");
			Object[] arr = (Object[]) it.next();
			System.out.print("�Ա�" + arr[0] + " .........");
			System.out.print("������" + arr[1]);
			// System.out.print("ְ��" + emp.getBusiness() + " ");
			// System.out.print("��ַ��" + emp.getAddress() + " ");
			// System.out.print("��ע��" + emp.getRemark() + " ");
			System.out.println();
		}
	}

}
