package test.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��sql����г��ֱ���ʱ���������ֵΪ�����Ͳ���"+arg+"���ַ�������'"+arg+"'
 * 
 * @author tonghuo
 *
 */
public class JDBCVariable {
	public static void main(String[] args) throws Exception {

		String name = "��������";
		double price = 1223.333;
		int bookCount = 1000;
		String author = "ͼ������";

		Connection conn = JDBCVariable.getConnection();
		Statement statement = conn.createStatement();
		String sql = "insert into tb_books(name,price,bookCount,author)	values('" + name + "'," + price + ","
				+ bookCount + ",'" + author + "')";

		// String sql = "insert into tb_books(name,price,bookCount,author)
		// values('name',1223,1000,'�й�')";
		System.out.println("sql----" + sql);
		statement.execute(sql);
		statement.close();
		conn.close();
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3366/db_database10";
			String user = "root";
			String password = "123";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
