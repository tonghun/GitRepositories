package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import servlet.DirectoryUtils;

/**
 * Servlet implementation class AnalyzeServlet
 */
@WebServlet("/AnalyzeServlet")
public class AnalyzeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnalyzeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=UTF-8");

		String filePath = DirectoryUtils.getLocalPath(request, "/XML/test03/test01.xml");
		System.out.println("filePath:" + filePath);
		SAXReader reader = new SAXReader();

		Document doc = null;
		try {
			doc = reader.read(new File(filePath));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element root = doc.getRootElement();
		String rootName = root.getName();

		PrintWriter out = response.getWriter();

		// ��ȡ���ڵ�
		out.write("���ڵ����ƣ�" + "<h1 style='color:red;'>" + rootName + "</h1>" + "<br>");
		out.println("-----------------------------<br>");
		out.println("<h3>ȫ��name�ӽڵ������</h3><br>");

		// �����ӽڵ㣬�������
		List<Element> list = root.elements("name02");
		for (Element x : list) {
			String nodeContent = x.getText();
			String nodeName = x.getName();
			// String nodeComment=x.get();
			Attribute attr = x.attribute(2);// ��������λ�û�ȡ����
			out.println("���ԣ�" + attr.getName() + "-----");
			out.println(attr.getValue() + "<br>");// ��ȡ����ֵ
			// attr.setName("�޸ĺ��������");
			// attr.setValue("�޸ĺ������ֵ");// �޸�����ֵ
			// attr.setName("at01");
			// attr.detach();//ɾ���ڵ�
			x.addAttribute("����z1", "����ֵ");
			x.setText("�ڵ���������");
			// x.detach();//ɾ���ڵ�
			// x.setName("name02");//�޸Ľڵ�����
			out.write(nodeName + "������------" + nodeContent + "<br>");
		}

		// root.attribute("name");

		// �ĵ��޸�֮����Ҫ����д���ļ�
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileWriter(filePath), format);// XMLWriter��һ��װ����
		writer.write(doc);
		writer.close();

		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("ҳ�����֮��");
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
