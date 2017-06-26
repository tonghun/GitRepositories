package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * new Person(Object obj01,Object obj02):ʹ����������˼���ȡָ���ֶΣ�ǰ����ʵ���൱�д�����Ӧ�Ĺ��췽��
 */
public class Test06 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("�����ѯ");
			String hql = " select new Employee(sex,name) from Employee emp where emp.sex=? ";
			Query q = session.createQuery(hql);
			q.setParameter(0, "��");
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
			Employee emp = (Employee) it.next();
			// System.out.print("ƽ����ţ�" + emp + " ");
			System.out.print("������" + emp.getName() + " ");
			System.out.print("�Ա�" + emp.getSex() + " ");
			// System.out.print("ְ��" + emp.getBusiness() + " ");
			// System.out.print("��ַ��" + emp.getAddress() + " ");
			// System.out.print("��ע��" + emp.getRemark() + " ");
			System.out.println();
		}
	}

}
