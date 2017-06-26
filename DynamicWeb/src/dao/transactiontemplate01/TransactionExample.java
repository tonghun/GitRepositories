package dao.transactiontemplate01;

import java.sql.Connection;
import java.sql.Statement;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class TransactionExample {
	private TransactionTemplate transactionTemplate;
	private PlatformTransactionManager transactionManager;
	private DataSource dataSource;

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void transactionOperation() {
		transactionTemplate.execute(new MyTransactionCallback());
	}

	private class MyTransactionCallback implements TransactionCallback {

		@Override
		public Object doInTransaction(TransactionStatus arg0) {
			Connection conn = DataSourceUtils.getConnection(dataSource);
			try {
				Statement state = conn.createStatement();
				state.execute("insert into tb_books(name,price,bookCount,author) values('中国故事',2000,1000,'中国')");
				// @SuppressWarnings("unused")
				int a = 9 / 0;
				state.execute("insert into tb_books(name,price,bookCount,author) values('美国故事',2000,1000,'中国')");
			} catch (Exception e) {
				System.out.println("status:" + arg0);
				transactionManager.rollback(arg0);
				System.out.println("操作失败，事务回滚");
				e.printStackTrace();
			}

			return null;
		}

	}
}
