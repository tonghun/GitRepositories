package dao.hibernate01;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import hibernate.Book;

public class BookDao extends HibernateDaoSupport {
	public void add(Book book) {
		this.getHibernateTemplate().save(book);
	}
}
