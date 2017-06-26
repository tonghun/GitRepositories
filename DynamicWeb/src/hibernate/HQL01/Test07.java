package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * 分组函数：group by
 */
public class Test07 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("排序查询");
			String hql = " select emp.sex,count(*) from Employee emp group by sex";
			Query q = session.createQuery(hql);
			// q.setParameter(0, "男");
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
		System.out.println("集合中元素个数：" + list.size());
		while (it.hasNext()) {
			// Object emp = it.next();
			// Employee emp = (Employee) it.next();
			// System.out.print("平均编号：" + emp + " ");
			Object[] arr = (Object[]) it.next();
			System.out.print("性别：" + arr[0] + " .........");
			System.out.print("人数：" + arr[1]);
			// System.out.print("职务：" + emp.getBusiness() + " ");
			// System.out.print("地址：" + emp.getAddress() + " ");
			// System.out.print("备注：" + emp.getRemark() + " ");
			System.out.println();
		}
	}

}
