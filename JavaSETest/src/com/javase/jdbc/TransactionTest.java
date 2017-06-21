package com.javase.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1.���񽫶����ݿ�Ĳ�������洢�ڻ����У����ڻ������ݽ��в������������е�����ֱ�Ӵӻ����л�ȡ��
 * �ύʱͬ�������ݿ⣬�ع���������档
 * 2.��JDBC�У������ڽ���֮ǰ�������ڲ��Ĳ������Ѿ�ִ����ϣ�����ִ��ʱ�����ڴ��ִ�У�ֻ����
 * �������ʱ����ִ�н����ͬ�������ݿ⣬������ա�
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
			String sql = "update tb_user set name='��С��' where name='����'";
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
