package jdbc;

import java.sql.*;
import java.util.Random;

public class Batch {

	public Connection getConnection() {
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

	public int saveBatch() {
		int row = 0;
		Connection conn = getConnection();
		try {
			String sql = "insert into tb_students(id,name,sex,age) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			Random r = new Random();
			for (int i = 0; i < 10; i++) {
				ps.setInt(1, i + 1);
				ps.setString(2, "学生" + i);
				ps.setBoolean(3, i % 2 == 0 ? true : false);
				ps.setInt(4, r.nextInt(5) + 10);
				ps.addBatch();
			}

			int[] rows = ps.executeBatch();
			for (int x : rows)
				System.out.println("executeBatch返回的数组中的值" + x);
			row = rows.length;
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return row;
	}
}
