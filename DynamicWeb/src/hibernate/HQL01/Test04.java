package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * ����HQL�Ĳ����󶨻��ƽ��в�ѯ
 */
public class Test04 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			System.out.println("�����ѯ");
			String hql = "from Employee emp where emp.sex=? order by emp.id desc";
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
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.print("��ţ�" + emp.getId() + "   ");
			System.out.print("������" + emp.getName() + "   ");
			System.out.print("�Ա�" + emp.getSex() + "   ");
			System.out.print("ְ��" + emp.getBusiness() + "   ");
			System.out.print("��ַ��" + emp.getAddress() + "   ");
			System.out.print("��ע��" + emp.getRemark() + "   ");
			System.out.println();
		}
	}

}
