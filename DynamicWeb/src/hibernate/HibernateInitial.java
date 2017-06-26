package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateInitial {

	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory = null;

	static {
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			System.out.println("SessionFactory���󴴽�ʧ��");
			e.printStackTrace();
		}
	}

	public static Session getSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		if (session == null || !session.isOpen()) {
			if (sessionFactory == null)
				rebuildSessionFactory();
			session = (sessionFactory != null) ? sessionFactory.openSession() : null;
			threadLocal.set(session);// ������ӵ���ǰ�̸߳����У��Թ��ر�sessionʱʹ��
		}
		return session;
	}

	public static void rebuildSessionFactory() {
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null)
			session.close();
	}
}
