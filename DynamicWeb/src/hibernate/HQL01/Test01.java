package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

public class Test01 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			String hql = "from Employee emp";
			Query q = session.createQuery(hql);
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
			System.out.print("编号：" + emp.getId() + "   ");
			System.out.print("姓名：" + emp.getName() + "   ");
			System.out.print("性别：" + emp.getSex() + "   ");
			System.out.print("职务：" + emp.getBusiness() + "   ");
			System.out.print("地址：" + emp.getAddress() + "   ");
			System.out.print("备注：" + emp.getRemark() + "   ");
			System.out.println();
		}
	}

}
