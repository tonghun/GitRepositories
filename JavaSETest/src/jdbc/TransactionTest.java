package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.事务将对数据库的操作结果存储在缓存中，基于缓冲数据进行操作，缓存已有的数据直接从缓存中获取，
 * 提交时同步到数据库，回滚则清除缓存。
 * 2.在JDBC中，事务在结束之前，事务内部的操作就已经执行完毕，这种执行时基于内存的执行，只是在
 * 事务结束时决定执行结果是同步到数据库，还是清空。
 * 
 * @author tonghuo
 *
 */
public class TransactionTest {

	public static Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3366/db_hibernate";
			String username = "root";
			String password = "123";
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static void main(String[] args) {
		Connection conn = getConnection();

		try {
			conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			String sql = "update tb_user set name='王小红' where name='王红'";
			int count = st.executeUpdate(sql);
			System.out.println("count----" + count);
			String sql01 = "select * from tb_user";
			ResultSet rs = st.executeQuery(sql01);
			while (rs.next()) {
				System.out.println("name----" + rs.getString("name"));
			}
			// conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
