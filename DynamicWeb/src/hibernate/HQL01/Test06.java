package hibernate.HQL01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.HibernateInitial;

/*
 * new Person(Object obj01,Object obj02):使用面向对象的思想获取指定字段，前提是实体类当中存在相应的构造方法
 */
public class Test06 {
	public static void main(String[] args) {
		Session session = null;
		List empList = new ArrayList();
		try {
			session = HibernateInitial.getSession();
			session.beginTransaction();
			// System.out.println("排序查询");
			String hql = " select new Employee(sex,name) from Employee emp where emp.sex=? ";
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
		Iterator it = list.iterator();
		System.out.println("集合中元素个数：" + list.size());
		while (it.hasNext()) {
			// Object emp = it.next();
			Employee emp = (Employee) it.next();
			// System.out.print("平均编号：" + emp + " ");
			System.out.print("姓名：" + emp.getName() + " ");
			System.out.print("性别：" + emp.getSex() + " ");
			// System.out.print("职务：" + emp.getBusiness() + " ");
			// System.out.print("地址：" + emp.getAddress() + " ");
			// System.out.print("备注：" + emp.getRemark() + " ");
			System.out.println();
		}
	}

}
