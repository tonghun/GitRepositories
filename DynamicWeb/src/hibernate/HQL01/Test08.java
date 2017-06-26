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
 * 分组函数：group by
 */
public class Test08 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			System.out.println("执行到此01");
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("排序查询");
			System.out.println("执行到此02");
			String hql = " select pep.name,id01.idcard_code from"
					+ " hibernate.package03.People pep left outer join hibernate.package03.IDcard id01";
			System.out.println("执行到此03");
			Query q = session.createQuery(hql);
			System.out.println("执行到此04");
			// q.setParameter(0, "男");
			empList = q.list();
			showList(empList);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("异常");
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
