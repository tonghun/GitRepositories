package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	Connection conn;

	public Connection getConnection() {
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

	public List<Product> find(int page) {
		List<Product> list = new ArrayList<Product>();
		Connection conn = getConnection();
		String sql = "select *from tb_product order by id desc limit ?,?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, (page - 1) * Product.PAGE_SIZE);
			ps.setInt(2, Product.PAGE_SIZE);

			ResultSet res = ps.executeQuery();
			// System.out.println("执行到此");
			while (res.next()) {
				Product product = new Product();
				product.setId(res.getInt("id"));
				product.setName(res.getString("name"));
				product.setCount(res.getInt("num"));
				product.setPrice(res.getDouble("price"));
				product.setUnit(res.getString("unit"));
				list.add(product);
			}
			res.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public int findCount() {
		int count = 0;

		Connection conn = getConnection();
		String sql = "select count(*)from tb_product";
		try {
			Statement s = conn.createStatement();
			ResultSet res = s.executeQuery(sql);
			if (res.next()) {
				count = res.getInt(1);
			}

			res.close();
			s.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// System.out.println("Dao中count："+count);
		return count;
	}
}
