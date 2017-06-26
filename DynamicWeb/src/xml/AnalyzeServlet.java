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

		// 获取根节点
		out.write("根节点名称：" + "<h1 style='color:red;'>" + rootName + "</h1>" + "<br>");
		out.println("-----------------------------<br>");
		out.println("<h3>全部name子节点的内容</h3><br>");

		// 遍历子节点，输出内容
		List<Element> list = root.elements("name02");
		for (Element x : list) {
			String nodeContent = x.getText();
			String nodeName = x.getName();
			// String nodeComment=x.get();
			Attribute attr = x.attribute(2);// 按照索引位置获取属性
			out.println("属性：" + attr.getName() + "-----");
			out.println(attr.getValue() + "<br>");// 获取属性值
			// attr.setName("修改后的属性名");
			// attr.setValue("修改后的属性值");// 修改属性值
			// attr.setName("at01");
			// attr.detach();//删除节点
			x.addAttribute("属性z1", "属性值");
			x.setText("节点新增内容");
			// x.detach();//删除节点
			// x.setName("name02");//修改节点名称
			out.write(nodeName + "的内容------" + nodeContent + "<br>");
		}

		// root.attribute("name");

		// 文档修改之后需要重新写入文件
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		XMLWriter writer = new XMLWriter(new FileWriter(filePath), format);// XMLWriter是一个装饰者
		writer.write(doc);
		writer.close();

		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("页面输出之后");
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
