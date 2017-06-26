package test.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 当sql语句中出现变量时，如果变量值为数字型采用"+arg+"，字符串采用'"+arg+"'
 * 
 * @author tonghuo
 *
 */
public class JDBCVariable {
	public static void main(String[] args) throws Exception {

		String name = "作者名称";
		double price = 1223.333;
		int bookCount = 1000;
		String author = "图书作者";

		Connection conn = JDBCVariable.getConnection();
		Statement statement = conn.createStatement();
		String sql = "insert into tb_books(name,price,bookCount,author)	values('" + name + "'," + price + ","
				+ bookCount + ",'" + author + "')";

		// String sql = "insert into tb_books(name,price,bookCount,author)
		// values('name',1223,1000,'中国')";
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
