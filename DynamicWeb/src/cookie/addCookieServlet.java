package cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addCookie
 */
@WebServlet("/addCookieServlet")
public class addCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addCookieServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String value = URLEncoder.encode("��һ��Cookie����", "UTF-8");// Cookie����ASCII���룬��֧�����ģ����Cookie��key����value�к�������ʱ�������֧�����ĵı��뷽ʽ
		Cookie firstCookie = new Cookie("firstCookie", value);
		Cookie secondCookie = new Cookie("secondCookie", "secondCookie value");
		String prePath = firstCookie.getPath();
		// String prePath = firstCookie.getPath();

		// firstCookie.setPath(request.getContextPath() +
		// "/");//����ͨ���������������ͨ�������ã�������ߴ����׼ȷ���������ԣ�
		// �趨һ���������������ύCookie�����·����Cookie���ڸ�·���µ�������·�����ǿɼ���

		// firstCookie.setMaxAge(2 * 69);
		// firstCookie.setMaxAge(10);

		response.addCookie(firstCookie);
		response.addCookie(secondCookie);

		PrintWriter out = response.getWriter();
		out.write("1.Cookie��֧������");
		out.write("<br>");
		out.write("δ�趨ʱfirstCookie�İ�·����" + prePath);
		out.write("<br>");
		out.write(firstCookie.toString());
		out.write("<br>");
		out.write("Cookie����Чʱ��С��0");
		// out.write(path);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
