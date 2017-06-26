package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * 利用HQL的参数绑定机制进行查询
 */
public class Test04 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			System.out.println("排序查询");
			String hql = "from Employee emp where emp.sex=? order by emp.id desc";
			Query q = session.createQuery(hql);
			q.setParameter(0, "男");
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
