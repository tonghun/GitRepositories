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
 *         1.Session���������������ĻỰ״̬�����ڷ������ˣ���Cookie���������������ĻỰ״̬������������ˣ�
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

			out.write("������������Ϣ");
			out.write("<br>");
			out.write(session.toString());
			out.write("<br>");
			out.write("��ǰSession����ľ�Ĭʱ��----" + timeout);
		} else
			out.write("session���󲻴���");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
