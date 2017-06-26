package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getCookieServlet
 */
@WebServlet("/getCookieServlet")
public class getCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getCookieServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie x : cookies) {
				String name = x.getName();
				String value = x.getValue();
				out.write(name + "----" + value);
				out.write("<br>");
				out.write(x.toString());
				out.write("<br>");
			}
		} else {
			out.write("不存在Cookie对象");
		}
	}

}
