package dao.transactionProxyFactoryBean01;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AddDAO extends JdbcDaoSupport {
	public void add() {
		String sql = "insert into tb_books(name,price,bookCount,author) values('TransactionProxy',200,200,'зїеп')";
		getJdbcTemplate().execute(sql);
		// int a = 9 / 0;
		getJdbcTemplate().execute(sql);
	}
}
