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

		String value = URLEncoder.encode("第一个Cookie对象", "UTF-8");// Cookie采用ASCII编码，不支持中文，因此Cookie的key或者value中含有中文时必须采用支持中文的编码方式
		Cookie firstCookie = new Cookie("firstCookie", value);
		Cookie secondCookie = new Cookie("secondCookie", "secondCookie value");
		String prePath = firstCookie.getPath();
		// String prePath = firstCookie.getPath();

		// firstCookie.setPath(request.getContextPath() +
		// "/");//可以通过程序程序获得因素通过程序获得，可以提高代码的准确性与适用性；
		// 设定一个浏览器向服务器提交Cookie对象的路径，Cookie对于该路径下的所有子路径都是可见的

		// firstCookie.setMaxAge(2 * 69);
		// firstCookie.setMaxAge(10);

		response.addCookie(firstCookie);
		response.addCookie(secondCookie);

		PrintWriter out = response.getWriter();
		out.write("1.Cookie不支持中文");
		out.write("<br>");
		out.write("未设定时firstCookie的绑定路径：" + prePath);
		out.write("<br>");
		out.write(firstCookie.toString());
		out.write("<br>");
		out.write("Cookie的有效时长小于0");
		// out.write(path);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
