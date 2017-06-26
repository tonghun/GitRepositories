package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author tonghuo
 *
 *         1.Session将浏览器与服务器的会话状态保留在服务器端，而Cookie将浏览器与服务器的会话状态保留在浏览器端；
 */
@WebServlet("/SessionServlet01")
public class SessionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet01() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		if (session != null) {
			int timeout = session.getMaxInactiveInterval();
			System.out.println(session);
			System.out.println("timeout----" + timeout);
			// session.setMaxInactiveInterval(5 * 60);

			out.write("服务器反馈信息");
			out.write("<br>");
			out.write(session.toString());
			out.write("<br>");
			out.write("当前Session对象的静默时长----" + timeout);
		} else
			out.write("session对象不存在");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
