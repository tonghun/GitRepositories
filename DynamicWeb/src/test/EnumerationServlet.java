package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnumerationServlet
 * 
 * 1.Enumeration是一个枚举类型的集合，一个interface，只有两个方法：boolean
 * hasMoreElements,nextElement；
 * 
 * 2.Enumeration是一个接口，不能主动创建对象。
 */
@WebServlet(urlPatterns = "/EnumerationServlet", initParams = { @WebInitParam(name = "key01", value = "value01"),
		@WebInitParam(name = "key02", value = "value02"), @WebInitParam(name = "key03", value = "value03") })
public class EnumerationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config = null;

	public ServletConfig getConfig() {
		return config;
	}

	public void setConfig(ServletConfig config) {
		this.config = config;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		setConfig(config);
		super.init(config);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EnumerationServlet() {
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

		config = getConfig();
		PrintWriter out = response.getWriter();

		String servletName = config.getServletName();
		ServletContext application = config.getServletContext();

		Enumeration<String> enum01 = config.getInitParameterNames();
		out.print("Enumeration是一个枚举集合，一个interface，只用两个方法：boolean hasMoreElement,nextElement");
		out.print("<br>");
		out.print("servletName----" + servletName);
		out.print("<br>");
		out.print("application----" + application);
		out.print("<br>");
		while (enum01.hasMoreElements()) {
			String temp = enum01.nextElement();
			out.print(temp);
			out.print("<br>");
		}
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
