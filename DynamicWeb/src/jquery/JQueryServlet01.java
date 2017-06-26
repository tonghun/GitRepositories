package jquery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JQueryServlet01")
public class JQueryServlet01 extends HttpServlet {

	private static final long serialVersionUID = -3032911298435812016L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("JQueyServlet");

		String action = request.getParameter("action");

		switch (action) {
		case "load":
			load(request, response);
			break;
		case "get":
			get(request, response);
			break;
		case "post":
			post(request, response);
			break;
		}
	}

	private void post(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		String name = "post";
		int age = 2;
		PrintWriter out = response.getWriter();
		out.write("姓名---" + name + "---年龄---" + age);
	}

	private void get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		String name = "get";
		int age = 1;
		PrintWriter out = response.getWriter();
		out.write("姓名---" + name + "---年龄---" + age);
	}

	private void load(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("load");
		String name = "load";
		int age = 0;
		PrintWriter out = response.getWriter();
		out.write("姓名---" + name + "---年龄---" + age);
	}

}
