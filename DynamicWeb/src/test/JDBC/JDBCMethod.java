package test.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ��ʾConnection Statement PreparedStatement���÷�
 * 
 * @author tonghuo
 *
 */
public class JDBCMethod {
	public static void main(String[] args) throws Exception {
		Connection conn = JDBCMethod.getConnection();

		/**
		 * ��ʾStatement����
		 */
		// String sql01 = "delete from tb_user where password='2323'";
		// String sql02 = "insert into tb_user(name,password) values('����',123)";
		// String sql03 = "insert into tb_user(name,password) values('����',123)";
		// Statement st = conn.createStatement();
		// st.addBatch(sql01);
		// st.addBatch(sql02);
		// st.addBatch(sql03);
		// int[] resArr=st.executeBatch();
		// for(int x:resArr)
		// System.out.println(x);
		// int resCount = st.executeUpdate(sql01);
		// System.out.println("sql�������ɹ�����Ӱ���������" + resCount);

		/**
		 * ��ʾPreparedStatement�ķ���
		 */
		// String sql = "insert into tb_user(name,password) values(?,?)";
		// PreparedStatement ps = conn.prepareStatement(sql);
		// for (int i = 0; i < 10; i++) {
		// ps.setString(1, "name" + i);
		// ps.setString(2, "pw" + i);
		// ps.addBatch();
		// }
		//
		// int[] resArr=ps.executeBatch();
		// for(int x:resArr)
		// System.out.println(x);

		// ps.setString(1, "name01");
		// ps.setString(2, "pw01");
		// int resCount=ps.executeUpdate();
		// System.out.println("sql�������ɹ�����Ӱ���������" + resCount);

		/**
		 * ��ʾResultSet�ķ�����һ����ʱ���Ըñ�Ĳ�������ֱ��ͬ�������ݿ���
		 */

		String sql = "select id,name,password from tb_user where password=?";
		// Statement st = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "123");
		ResultSet res = ps.executeQuery();
		while (res.next()) {
			System.out.println(1);
			// res.refreshRow();
			// res.updateString(1, "��1");
			// res.updateRow();
			String name = res.getString("name");
			String password = res.getString(3);
			System.out.println(name);
			System.out.println(password);
		}

		res.absolute(1);
		res.deleteRow();
		// res.refreshRow();
		String name = res.getString(2);
		System.out.println(name);
		res.close();
		ps.close();
		conn.close();

	}

	public static Connection getConnection() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3366/test01";
			String username = "root";
			String password = "123";
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}
