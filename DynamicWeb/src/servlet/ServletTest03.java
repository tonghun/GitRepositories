package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTest03
 */
@WebServlet("/ServletTest03")
public class ServletTest03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletTest03() {
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
		response.setContentType("text/html;charset=UTF-8");

		String contextPath = request.getContextPath();
		System.out.println("contextPath---" + contextPath);

		ServletContext context = request.getServletContext();
		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();
		out.write("<p color=\"red\"");
		out.write(">1.在Servlet中HTML的标记可以被拆分输出；<br>2.默认情况下Servlet的响应方式为get，所以在单独运行Servlet时，其中的doGet方法被执行。</p>");
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("text/html;charset=UTF-8");
		// PrintWriter out = response.getWriter();
		// out.write("<p color=\"red\"");
		// out.write(">以红色显示2</p>");
		// out.flush();
		// out.close();
		// doGet(request, response);
	}

}
