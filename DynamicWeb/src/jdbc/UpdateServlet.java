package jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id;
		int bookCount = 0;
		if (request.getParameter("id") == null || request.getParameter("bookCount") == null) {
			return;
		} else {
			System.out.println("id的值前" + request.getParameter("id"));
			System.out.println("bookCount的值前" + request.getParameter("bookCount"));
			id = Integer.valueOf(request.getParameter("id"));
			bookCount = Integer.valueOf(request.getParameter("bookCount"));
			System.out.println("id的值后" + id);
			System.out.println("bookCount的值后" + bookCount);
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3366/db_database10";
			String user = "root";
			String password = "123";
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "update tb_books set bookCount=? where id=?";
			System.out.println("id的值try01:" + id);
			System.out.println("bookCount的值try01:" + bookCount);
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("id的值try02:" + id);
			System.out.println("bookCount的值try02:" + bookCount);
			ps.setInt(1, bookCount);
			ps.setInt(2, id);
			ps.executeUpdate();
			ps.close();
			conn.close();
			System.out.println("id的值try03:" + id);
			System.out.println("bookCount的值try03:" + bookCount);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException0");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException0");
		} catch (Exception e) {
			System.out.println("Exception0");
		}

		response.sendRedirect("FindServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
