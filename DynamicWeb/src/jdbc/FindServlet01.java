package jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import jdbc.*;

/**
 * Servlet implementation class FindServlet01
 */
@WebServlet("/FindServlet01")
public class FindServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindServlet01() {
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
		int currPage = 1;
		if (request.getParameter("page") != null) {
			currPage = Integer.valueOf(request.getParameter("page"));

		}

		Dao dao = new Dao();
		List<Product> list = dao.find(currPage);
		request.setAttribute("list", list);
		int pages;
		int count = dao.findCount();
		// System.out.println("FindServlet01ÖÐcount:" + count);
		if (count % Product.PAGE_SIZE == 0) {
			pages = count / Product.PAGE_SIZE;
			// System.out.println("FindServlet01ÖÐpages:" + pages);
		} else {
			pages = count / Product.PAGE_SIZE + 1;
		}

		StringBuffer builder = new StringBuffer();
		for (int i = 1; i <= pages; i++) {
			if (i == currPage) {
				builder.append("[" + i + "]");
			} else {
				builder.append("<a href='FindServlet01?page=" + i + "'>" + i + "</a>");
			}
			builder.append(" ");
		}
		// System.out.println("currPage" + currPage);
		// System.out.println("pages" + pages);
		// System.out.println("builder1:" + builder.toString().length());
		request.setAttribute("bar", builder.toString());
		request.getRequestDispatcher("/JDBC/product_list.jsp").forward(request, response);
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
