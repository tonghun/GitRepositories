package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
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

@SuppressWarnings("unused")
public class PlacardServlet extends HttpServlet {

	private static final long serialVersionUID = -920027908106362861L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		// String fileURL = request.getRealPath("/XML/placard.xml");//此方法已过时
		// URL url = new
		// URL("http://localhost:8080/DynamicWeb/XML/placard.xml");
		// URLConnection conn = url.openConnection();
		// conn.setDoOutput(true);
		// OutputStreamWriter outWriter = new
		// OutputStreamWriter(conn.getOutputStream());
		// System.out.println("url:" + url.toString());

		String fileURL = DirectoryUtils.getLocalPath(request, "/XML/test04/placard.xml");
		System.out.println("来自DirectoryUtils-------path:" + fileURL);

		// String contextPath = request.getContextPath();
		// System.out.println("contextPath:" + contextPath);
		// contextPath = contextPath.substring(1);
		//
		// String requestURL = request.getRequestURL().toString();// 获取请求所指向的地址
		// System.out.println("requestURL：" + requestURL);
		//
		// String headerReferer = request.getHeader("referer");// 获取调用该资源的对象的地址
		// System.out.println("headerReferer:" + headerReferer);
		//
		// String fileURL01 =
		// request.getSession().getServletContext().getRealPath("/XML/Placard.xml");
		//
		// String tempS01 =
		// fileURL01.replace("\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\",
		// "\\");
		// System.out.println("tempS01:" + tempS01);
		// int index01 = tempS01.indexOf(contextPath);
		// System.out.println("index01:" + index01);
		// StringBuilder strBuilder = new StringBuilder(tempS01);
		// strBuilder.insert(index01 + contextPath.length(), "\\WebContent");
		// String fileURL = strBuilder.toString();
		// System.out.println("tempS02:" + fileURL);

		System.out.println("fileURL:" + fileURL);
		File file = new File(fileURL);
		System.out.println("parentPath:" + file.getParent());
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Document document = null;
		Element placard = null;
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		if (!file.exists()) {
			file.createNewFile();
			document = DocumentHelper.createDocument();
			placard = DocumentHelper.createElement("placard");
			document.setRootElement(placard);

			placard.addAttribute("version", "2.0");
			Element description = placard.addElement("description");
			description.setText("公告栏");
			Element createTime = placard.addElement("createTime");
			createTime.setText("创建于" + df.format(new Date()));
		} else {
			SAXReader reader = new SAXReader();
			try {
				document = reader.read(new File(fileURL));
				placard = document.getRootElement();
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		}

		if (placard.elements("info") == null) {
			placard.addElement("info");
		}

		String id = String.valueOf(placard.elements("info").size() + 1);
		Element info = placard.addElement("info");
		info.addAttribute("id", id);
		Element title_info = info.addElement("title");
		title_info.setText(title);
		Element content_item = info.addElement("content");

		content_item.addCDATA(content);
		Element pubDate_item = info.addElement("pubDate");
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		pubDate_item.setText(df.format(new Date()));

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		try {
			XMLWriter writer = new XMLWriter(new FileWriter(fileURL), format);
			writer.write(document);
			writer.flush();
			writer.close();
			System.out.println("writer已关闭");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// int timeout = 3000;
		// if (placard.elements("info").size() == 1)
		// timeout = 5000;

		// try {
		// Thread.sleep(timeout);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		request.getRequestDispatcher("/XML/placard.xml").forward(request, response);// 访问的是部署路径中的内容，创建路径中的内容不允许应用程序访问
	}
}
