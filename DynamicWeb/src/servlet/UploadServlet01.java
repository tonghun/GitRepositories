package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet01
 */
@WebServlet("/UploadServlet01")
@MultipartConfig()
public class UploadServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet01() {
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
		System.out.println("UploadServlet01��ʼִ��");

		HttpServletRequest req = (HttpServletRequest) request;
		String target = req.getRequestURI();
		System.out.println("UploadServlet01----target:" + target);

		response.setContentType("text/html;charset=UTF-8");
		String savePath = getServletContext().getRealPath("/WEB-INF/uploadFile");// �����ʱ��request.getRealPath(String
																					// path)
		// System.out.println("savaPath:" + savePath);

		Part part = request.getPart("file");
		String fileName = UploadUtils.getFileName(part);

		// ApplicationPart ap = (ApplicationPart) part;
		// @SuppressWarnings("deprecation")
		// String fileAllName = ap.getFilename();// ���ֻ�ȡ�ϴ��ļ��ļ����ķ����ѹ�ʱ
		// int index = fileAllName.indexOf("\\") + 1;//
		// Ϊ�˱�����ת���ַ��еġ�\��������ͻ����ʾ��ͨ�ַ�ʱ�á�\\�������桰\��
		// String fileName = fileAllName.substring(index, fileAllName.length());
		part.write(savePath + File.separator + fileName);

		// String header = part.getHeader("content-disposition");//
		// content-disposition��Header��һ�����ԣ�form-data;
		// name="file";
		// filename="��װSQL
		// Server
		// 2005.swf"
		// System.out.println("header:" + header);
		// System.out.println("fileName:" + getFileName(part));

		// �������ҳ�������Ϣ
		PrintWriter out = response.getWriter();
		out.println("�ļ��ϴ��ɹ�");
	}

	// @SuppressWarnings("resource")
	// public String getFileName(Part p) {
	// String header = p.getHeader("content-disposition");//
	// ���ı�ɨ����������Դ��ͨ�����캯�����βδ���ɨ����
	// String regex = ".*filename=";
	// Scanner scanner = new Scanner(header).useDelimiter(regex);
	// String s = scanner.next();
	// String fileName = s.substring(1, s.length() - 1);
	// scanner.close();
	// // System.out.println(fileName);
	// return fileName;
	// }
}
