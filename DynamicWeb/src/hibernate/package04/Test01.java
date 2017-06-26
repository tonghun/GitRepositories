package hibernate.package04;

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
			User user = (User) session.get(User.class, 1);
			System.out.println(user.getName() + "用户拥有的权限如下：");
			Set<Role> roles = user.getRoles();
			Iterator<Role> it = roles.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().getRoleName() + "||");
			}

			Role role = (Role) session.get(Role.class, 2);
			System.out.println(role.getRoleName() + "拥有的权限用户如下：");
			Set<User> users = role.getUsers();
			Iterator<User> it01 = users.iterator();
			while (it01.hasNext()) {
				System.out.println(it01.next().getName() + "||");
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				HibernateInitial.closeSession();
		}
	}
}
