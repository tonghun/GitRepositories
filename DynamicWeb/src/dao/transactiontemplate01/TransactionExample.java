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
				state.execute("insert into tb_books(name,price,bookCount,author) values('�й�����',2000,1000,'�й�')");
				// @SuppressWarnings("unused")
				int a = 9 / 0;
				state.execute("insert into tb_books(name,price,bookCount,author) values('��������',2000,1000,'�й�')");
			} catch (Exception e) {
				System.out.println("status:" + arg0);
				transactionManager.rollback(arg0);
				System.out.println("����ʧ�ܣ�����ع�");
				e.printStackTrace();
			}

			return null;
		}

	}
}
