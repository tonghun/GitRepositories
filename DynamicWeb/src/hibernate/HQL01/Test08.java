package hibernate.HQL01;

import hibernate.package03.People;
import hibernate.package03.IDcard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * ���麯����group by
 */
public class Test08 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			System.out.println("ִ�е���01");
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("�����ѯ");
			System.out.println("ִ�е���02");
			String hql = " select pep.name,id01.idcard_code from"
					+ " hibernate.package03.People pep left outer join hibernate.package03.IDcard id01";
			System.out.println("ִ�е���03");
			Query q = session.createQuery(hql);
			System.out.println("ִ�е���04");
			// q.setParameter(0, "��");
			empList = q.list();
			showList(empList);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("�쳣");
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
