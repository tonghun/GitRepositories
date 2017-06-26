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
 * ����̲߳���ͬһ������ͬһ�������ڲ���ȫ�ֱ�������漰�޸ģ������̰߳�ȫ���⣬���������
 * 
 * 1.��ȫ�ֱ���ת��Ϊ�ֲ��������ֲ��������̼߳䲻���� 2.ʹ��ͬ�����ƣ�ͬ�������ͬ��������
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
