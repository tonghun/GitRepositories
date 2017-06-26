package dao.transactionTemplate02;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@SuppressWarnings("unused")
public class TransactionExample {

	private PlatformTransactionManager transactionManager;
	private DataSource dataSource;
	private TransactionTemplate transactionTemplate;

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

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void execute() {
		transactionTemplate.execute(new MyTransactionCallback());
	}

	private class MyTransactionCallback implements TransactionCallback {

		// �ڷ���doInTransaction���������ľ�������
		@Override
		public Object doInTransaction(TransactionStatus arg0) {
			// Connection conn =
			// DataSourceUtils.getConnection(dataSource);//��������ԴdataSource�������ݿ����Ӷ����һ�ַ�ʽ

			try {
				Connection conn = dataSource.getConnection();
				Statement state = conn.createStatement();
				String sql01 = "insert into tb_books(name,price,bookCount,author) values('����',200,200,'����')";
				String sql02 = "insert into tb_books(name,price,bookCount,author) values('����',200,200,'����')";
				state.execute(sql01);
				state.execute(sql02);
				// state.close();
				// conn.close();
			} catch (Exception e) {
				System.out.println("�������ʧ��");
				e.printStackTrace();
			}
			return null;
		}

	}
}
