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

		// 在方法doInTransaction中添加事务的具体内容
		@Override
		public Object doInTransaction(TransactionStatus arg0) {
			// Connection conn =
			// DataSourceUtils.getConnection(dataSource);//利用数据源dataSource创建数据库连接对象的一种方式

			try {
				Connection conn = dataSource.getConnection();
				Statement state = conn.createStatement();
				String sql01 = "insert into tb_books(name,price,bookCount,author) values('书名',200,200,'作者')";
				String sql02 = "insert into tb_books(name,price,bookCount,author) values('书名',200,200,'作者')";
				state.execute(sql01);
				state.execute(sql02);
				// state.close();
				// conn.close();
			} catch (Exception e) {
				System.out.println("数据添加失败");
				e.printStackTrace();
			}
			return null;
		}

	}
}
