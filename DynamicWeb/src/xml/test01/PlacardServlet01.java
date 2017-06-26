package xml.test01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import servlet.DirectoryUtils;

/**
 * Servlet implementation class placardServlet01
 */
@WebServlet("/PlacardServlet01")
public class PlacardServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlacardServlet01() {
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
		// response.setContentType("text/html");
		String action = request.getParameter("action");
		System.out.println("doGet-----action:" + action);
		if (action.equals("query")) {
			query(request, response);
		} else if (action.equals("modify_query")) {
			modify_query(request, response);
		} else if (action.equals("del")) {
			del(request, response);
		} else if (action.equals("clearAll")) {
			clearAll(request, response);
		} else if (action.equals("modify")) {
			modify(request, response);
		}
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * 用于显示当前文档的全部内容
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("PlacardServlet01-----query-----start");

		response.setContentType("text/html;charset=UTF-8");
		// response.setCharacterEncoding("UTF-8");
		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test01/placard.xml");
		File file = new File(fileURL);
		Document doc = null;
		Element root = null;
		List list = null;
		String description = "";
		String createTime = "";
		if (file.exists()) {
			SAXReader reader = new SAXReader();
			// reader.setEncoding("GBK");
			try {
				doc = reader.read(file);
				root = doc.getRootElement();
				List nodeList = root.elements("info");
				description = root.element("description").getText();
				createTime = root.element("createTime").getText();
				int id = 0;
				String title = "";
				String content = "";
				String pubDate = "";
				if (nodeList.size() > 0) {
					list = new ArrayList();
				}

				for (int i = nodeList.size(); i > 0; i--) {
					PlacardForm f = new PlacardForm();
					Element node = (Element) nodeList.get(i - 1);
					// 获取id
					id = Integer.parseInt(node.attribute("id").getValue());
					f.setId(id);
					// 获取title
					if (node.element("title").getText() != null) {
						title = node.element("title").getText();
					} else {
						title = "暂无标题";
					}
					f.setTitle(title);

					System.out.println("query------title的内容" + title);

					// 获取content
					if (node.element("content").getText() != null) {
						content = node.element("content").getText();
					} else {
						content = "暂无内容";
					}
					f.setContent(content);

					if (node.element("pubDate").getText() != null) {
						pubDate = node.element("pubDate").getText();
					}
					f.setPubDate(pubDate);

					list.add(f);
				}

				doc.clearContent();// 释放文档对象占有的资源，原资源不变。

			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request.setAttribute("createTime", createTime);
		request.setAttribute("description", description);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/XML/test01/placardList.jsp").forward(request, response);
		System.out.println("PlacardServlet01-----query-----over");
	}

	/**
	 * 用于展示选择项当前的内容，以便修改
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void modify_query(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("PlacardServlet01-----modify_query-----start");

		response.setContentType("text/html;charset=UTF-8");
		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test01/placard.xml");
		File file = new File(fileURL);
		Document doc = null;
		Element root = null;
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id------" + id);
		PlacardForm f = new PlacardForm();
		if (file.exists()) {
			SAXReader reader = new SAXReader();
			try {
				doc = reader.read(file);
				root = doc.getRootElement();
				Element node = (Element) root.selectSingleNode("/placard/info[@id='" + id + "']");
				if (node != null) {
					System.out.println("node非空----------");
					String title = "";
					String content = "";
					String pubDate = "";
					id = Integer.parseInt(node.attribute("id").getValue());
					f.setId(id);

					if (node.element("title").getText() != null) {
						title = node.element("title").getText();
					} else {
						title = "暂无标题";
					}
					f.setTitle(title);
					// 获取content
					if (node.element("content").getText() != null) {
						content = node.element("content").getText();
					} else {
						content = "暂无内容";
					}
					f.setContent(content);

					if (node.element("pubDate").getText() != null) {
						pubDate = node.element("pubDate").getText();
					}
					f.setPubDate(pubDate);
					doc.clearContent();
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		request.setAttribute("placardContent", f);
		request.getRequestDispatcher("/XML/test01/modify.jsp").forward(request, response);
		System.out.println("PlacardServlet01-----modify_query-----over");
	}

	/**
	 * 修改：将修改的内容写入文件
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	private void modify(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("PlacardServlet01-----modify-----start");
		response.setContentType("text/html;charset=UTF-8");// MIME类型与编码格式主要用于客户端显示

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-");
		String pubDate = df.format(new Date());
		int id = Integer.parseInt(request.getParameter("id"));

		System.out.println("modify----------title:" + title);

		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test01/placard.xml");
		File file = new File(fileURL);
		Document doc = null;
		Element root = null;
		if (file.exists()) {
			SAXReader reader = new SAXReader();
			try {
				doc = reader.read(file);
				root = doc.getRootElement();
				Element node = (Element) root.selectSingleNode("/placard/info[@id='" + id + "']");
				if (node != null) {
					node.element("title").setText(title);
					node.element("content").setText(content);
					node.element("pubDate").setText(pubDate);
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");

		try {
			XMLWriter writer = new XMLWriter(new FileWriter(fileURL), format);
			writer.write(doc);
			writer.flush();
			writer.close();
			doc.clearContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter out = response.getWriter();
		out.write("<script>alert('修改成功');window.location.href='/DynamicWeb/PlacardServlet01?action=query';</script>");
		System.out.println("PlacardServlet01-----modify-----over");
	}

	private void del(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("PlacardServlet01-----del-----start");

		response.setContentType("text/html;charset=UTF-8");

		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test01/placard.xml");
		File file = new File(fileURL);

		int id = Integer.parseInt(request.getParameter("id"));

		Document doc = null;
		Element root = null;
		if (file.exists()) {
			SAXReader reader = new SAXReader();
			try {
				doc = reader.read(file);
				root = doc.getRootElement();
				Element node = (Element) root.selectSingleNode("/placard/info[@id='" + id + "']");
				if (node != null) {
					root.remove(node);
				}
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");

		try {
			XMLWriter writer = new XMLWriter(new FileWriter(fileURL), format);
			writer.write(doc);
			writer.flush();
			writer.close();
			// doc.clearContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter out = response.getWriter();
		out.write("<script>alert('删除成功');window.location.href='/DynamicWeb/PlacardServlet01?action=query';</script>");

		System.out.println("PlacardServlet01-----del-----over");
	}

	private void clearAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("PlacardServlet01-----clearAll-----start");

		response.setContentType("text/html;charset=UTF-8");

		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test01/placard.xml");
		File file = new File(fileURL);

		Document doc = null;
		Element root = null;
		if (file.exists()) {
			SAXReader reader = new SAXReader();
			try {
				doc = reader.read(file);
				root = doc.getRootElement();
				root.elements("info").clear();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");

		try {
			XMLWriter writer = new XMLWriter(new FileWriter(fileURL), format);
			writer.write(doc);
			writer.flush();
			writer.close();
			// doc.clearContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter out = response.getWriter();
		out.write("<script>alert('全部删除成功');window.location.href='/DynamicWeb/PlacardServlet01?action=query';</script>");

		System.out.println("PlacardServlet01-----clearAll-----over");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("text/html;charset=UTF-8");
		// String action = request.getParameter("action");
		// if (action.equals("modify")) {
		// modify(request, response);
		// }
		doGet(request, response);
	}

}
