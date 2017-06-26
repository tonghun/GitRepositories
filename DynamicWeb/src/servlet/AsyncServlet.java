package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncServlet
 */
// @WebServlet("/AsyncServlet")
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AsyncServlet() {
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
		doPut(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("AsyncServlet��ʼִ��");
		System.out.println("��ʼʱ�䣺" + System.currentTimeMillis());

		// longRunning();

		AsyncContext async = request.startAsync();
		async.setTimeout(3 * 1000);
		async.start(new LongRunning());

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>AsyncContext����Servlet3.0�첽���Ƶľ���ʵ�������<body>");
		out.println("<form><input type='text'name='content'/size='50'></form>");
		out.println("<html>");
		out.flush();
		out.close();

		// request.getRequestDispatcher("/Servlet/asyncSupported.jsp").forward(request,
		// response);
		System.out.println("����ʱ�䣺" + System.currentTimeMillis());

	}

	public void longRunning() {
		System.out.println("����longTime��");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public class LongRunning implements Runnable {
		public void run() {
			System.out.println("����longRunning��" + System.currentTimeMillis());
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("LongRunningִ�����" + System.currentTimeMillis());
		}
	}
}
