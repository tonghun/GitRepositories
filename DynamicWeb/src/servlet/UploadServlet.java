package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@WebServlet(name = "UploadServlet", urlPatterns = "/UploadServlet")
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = -8854801173089324991L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// �洢·��
		String savePath = request.getServletContext().getRealPath("/WEB-INF/uploadFile");
		// ��ȡ�ϴ����ļ�����
		Collection<Part> parts = request.getParts();
		// �ϴ������ļ�
		if (parts.size() == 1) {
			Part part = request.getPart("file");
			// Servlet3û���ṩֱ�ӻ�ȡ�ļ����ķ���,��Ҫ������ͷ�н�������
			// ��ȡ����ͷ������ͷ�ĸ�ʽ��form-data; name="file"; filename="snmp4j--api.zip"
			// String header = part.getHeader("content-disposition");
			String fileName = UploadUtils.getFileName(part);
			createFile(savePath + File.separator);
			part.write(savePath + File.separator + fileName);
		} else {
			for (Part part : parts) {
				// String header = part.getHeader("content-disposition");
				String fileName = UploadUtils.getFileName(part);
				part.write(savePath + File.separator + fileName);
			}
		}
		PrintWriter out = response.getWriter();
		out.println("�ϴ��ɹ�");
		out.flush();
		out.close();
	}

	/**
	 * ��������ͷ�������ļ��� ����ͷ�ĸ�ʽ�������google������£�form-data; name="file";
	 * filename="snmp4j--api.zip" IE������£�form-data; name="file";
	 * filename="E:\snmp4j--api.zip"
	 */

	// public String getFileName(String header) {
	// /**
	// * String[] tempArr1 =
	// * header.split(";");����ִ����֮���ڲ�ͬ��������£�tempArr1���������������������
	// *
	// �������google������£�tempArr1={form-data,name="file",filename="snmp4j--api.zip"}
	// * IE������£�tempArr1={form-data,name="file",filename="E:\snmp4j--api.zip"}
	// */
	// String[] tempArr1 = header.split(";");
	// /**
	// * �������google������£�tempArr2={filename,"snmp4j--api.zip"}
	// * IE������£�tempArr2={filename,"E:\snmp4j--api.zip"}
	// */
	// String[] tempArr2 = tempArr1[2].split("=");
	// String fileName = tempArr2[1].substring(tempArr2[1].lastIndexOf("\\") +
	// 1).replaceAll("\"", "");
	// return fileName;
	// }

	// �ж�Ŀ¼�Ƿ���ڣ������ڣ��򴴽�
	public void createFile(String dir) {
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdir();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}