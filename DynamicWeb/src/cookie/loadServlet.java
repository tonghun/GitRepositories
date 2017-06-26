package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loadServlet
 */
@WebServlet("/loadServlet")
public class loadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loadServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String freeLoad = request.getParameter("freeLoad");

		PrintWriter out = response.getWriter();

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean isLoadSuccess = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String username = "root";
			String userPass = "123";
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3366/test01", username, userPass);
			String sql = "select name,password from tb_user where name=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				isLoadSuccess = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (rs != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		if (isLoadSuccess) {

			if (freeLoad != null && freeLoad.equals("ok")) {
				Cookie loadCookie = new Cookie("freeInfo", "" + name + "," + password + "");
				loadCookie.setMaxAge(10 * 24 * 60 * 60);
				loadCookie.setPath(request.getContextPath() + "/");
				response.addCookie(loadCookie);
			}

			out.write("µÇÂ½³É¹¦");
		} else {
			out.write("µÇÂ½Ê§°Ü");
		}

	}

}
