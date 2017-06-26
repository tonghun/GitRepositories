package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import servlet.DirectoryUtils;

/**
 * Servlet implementation class TestServlet01
 */
@WebServlet(urlPatterns = "/TestServlet01")
public class TestServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet01() {
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
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("TestServlet��ʼִ��");
		response.setContentType("text/html");

		// ���ݲ��𲿷ֵ���Ե�ַ�ڴ������ִ�����Ӧ���ļ�
		String filePath = DirectoryUtils.getLocalPath(request, "/XML/test03/test01.xml");
		File file = new File(filePath);

		String nameP = request.getParameter("name");
		String idCardP = request.getParameter("idCard");

		Document doc = null;
		Element root = null;

		if (!file.exists()) {
			System.out.println("�ļ�������");
			// file.createNewFile();
			doc = DocumentHelper.createDocument();
			root = DocumentHelper.createElement("root");// �����ĵ���������DocumentHelper�������ڵ�
			doc.setRootElement(root);
			root.addAttribute("description", "���ڵ�");

		} else {
			System.out.println("�ļ�����");
			SAXReader reader = new SAXReader();
			try {
				System.out.println("flag01");
				doc = reader.read(file);
				System.out.println("flag02");
				root = doc.getRootElement();
				System.out.println("root-------" + root);
				if (root == null) {
					root = DocumentHelper.createElement("root");
					doc.setRootElement(root);
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				System.out.println("�쳣");
				e.printStackTrace();
			}
		}

		// if (root.elements("name") == null)
		// root.addElement("name");
		// if (root.elements("idCard") == null)
		// root.addElement("idCard");

		Element name = root.addElement("name");// ���ڵ�����ӽڵ�ķ�ʽ
		name.addAttribute("id", root.elements("name").size() + "");
		name.addAttribute("attri01", "�����ӽڵ�node01�ĵ�һ������");
		name.addComment("�ӽڵ�node01��ע��");
		name.setText(nameP);

		Element idCard = root.addElement("idCard");
		idCard.addAttribute("id", root.elements("idCard").size() + "");
		idCard.addCDATA(idCardP);

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");

		// ���������/���������װ���ߣ�װ����һ�������/�������һ�������/�����ͨ����Ϊ���캯���Ĳ�����������
		XMLWriter writer = new XMLWriter(new FileWriter(filePath), format);
		writer.write(doc);
		writer.flush();
		writer.close();

		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		request.getRequestDispatcher("/XML/test01.xml").forward(request, response);

		// PrintWriter out = response.getWriter();
		// out.write("�ĵ��������");
	}

}
