package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSafe
 * 
 * 
 * 多个线程操作同一个对象，同一个对象内部的全局变量如果涉及修改，存在线程安全问题，解决方案：
 * 
 * 1.将全局变量转化为局部变量，局部变量在线程间不共享； 2.使用同步机制，同步块或者同步方法。
 */
@WebServlet("/ServletSafe")
public class ServletSafe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String name;

	public ServletSafe() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// String name = request.getParameter("name");

		name = request.getParameter("name");
		out.write(name);
	}

}
