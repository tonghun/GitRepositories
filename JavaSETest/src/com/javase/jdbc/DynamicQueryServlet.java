package com.javase.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 利用JDBC实现动态查询
 * 
 * @author tonghuo
 *
 */
@WebServlet("/dynamicQueryServlet")
public class DynamicQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 获取请求参数
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String depNo = request.getParameter("depNo");

		// 关键是"where 1=1"，不需要再判断追加的查询条件前是否需要添加and，统一在前面添加and
		String baseSQL = "select name,sex,age,depNo from tb_employee where 1=1";
		StringBuilder builder = new StringBuilder();// 用于拼接SQL语句
		// 用于在占位符与参数值之间建立映射，占位符与参数值在各自序列中的排序一致，例如name的占位符在SQL语句中排第一，
		// name的参数值在集合中排第一。
		List<String> params = new ArrayList<String>();
		builder.append(baseSQL);
		if (isNotEmpty(name)) {
			builder.append(" and name=? ");
			params.add("name," + name);// 集合中不能仅仅存储具体的数据，还要存储字段名，以便后续根据字段名选择数据类型
		}
		if (isNotEmpty(sex)) {
			builder.append(" and sex=? ");
			params.add("sex," + sex);
		}
		if (isNotEmpty(age)) {
			builder.append(" and age=? ");
			params.add("age," + age);
		}
		if (isNotEmpty(depNo)) {
			builder.append(" and depNo=?");
			params.add("depNo," + depNo);
		}

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet res = null;
		StringBuilder resStr = new StringBuilder();
		try {
			conn = getConnection();
			ps = conn.prepareStatement(builder.toString());
			for (int i = 0; i < params.size(); i++) {
				String str = params.get(i);
				String[] arr = str.split(",");// arr[0]储存字段信息，用于区分字段；arr[1]存储数据，用于为占位符赋值
				// 因为为占位符赋值时，需要根据字段类型选择数据类型，所以在此判断类型
				if (arr[0].equals("age")) {
					int a = Integer.parseInt(arr[1]);
					ps.setInt(i + 1, a);
				} else {
					ps.setString(i + 1, arr[1]);
				}
			}
			res = ps.executeQuery();
			while (res.next()) {
				String targetName = res.getString("name");
				String targetSex = res.getString("sex");
				int targetAge = res.getInt("age");
				String targetDepNo = res.getString("depNo");
				String temp = "name=" + targetName + "--" + "sex=" + targetSex + "--" + "age=" + targetAge + "--"
						+ "depNo=" + targetDepNo;
				resStr.append(temp + "<br>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (res != null)
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		PrintWriter out = response.getWriter();
		int length = resStr.length();
		if (length == 0)
			out.write("查询为空");
		else
			out.write(builder.toString() + "<br>" + resStr.toString());
	}

	/**
	 * 判断请求参数是否存在，是否有数据输入
	 * 
	 * @param str
	 * @return
	 */
	private boolean isNotEmpty(String str) {
		if (str == null | str.equals("")) {
			return false;
		}
		return true;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3366/test01", "root", "123");
	}

}
