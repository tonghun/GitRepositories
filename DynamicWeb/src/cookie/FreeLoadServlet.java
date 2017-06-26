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
 * Servlet implementation class FreeLoadServlet
 */
@WebServlet("/FreeLoadServlet")
public class FreeLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FreeLoadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		if (cookies != null)
			System.out.println("Cookie数目----" + cookies.length);
		else {
			out.write("Cookies不存在");
			return;
		}

		String value = null;
		for (Cookie x : cookies) {
			String name = x.getName();
			if (name != null && name.equals("freeInfo"))
				value = x.getValue();
			System.out.println("value----" + value);
		}

		String[] sArr = value.split(",");
		for (String x : sArr)
			System.out.println(x);
		if (sArr[0].equals("admin") && sArr[1].equals("123"))
			response.sendRedirect(request.getContextPath() + "/" + "index.html");
	}
}
