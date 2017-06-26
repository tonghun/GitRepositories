package com.xml.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * 创建保存数据连接四要素的xml文档并读取
 * 
 * @author tonghuo
 *
 */
public class CreateAndFetchJDBCConnectionXML {

	@Test
	public void testCreateXML() {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("jdbc-connection");
		root.addComment("这是数据库连接四要素");
		Element driver_class = root.addElement("driver-class");
		driver_class.setText("com.mysql.jdbc.Driver");

		Element url = root.addElement("url");
		url.setText("jdbc:mysql://127.0.0.1:3366/db_spring");

		Element user = root.addElement("user");
		user.setText("root");

		Element password = root.addElement("password");
		password.setText("123");

		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");

		File file = new File("Files/jdbc-connection.xml");
		try {
			XMLWriter writer = new XMLWriter(new FileWriter(file), format);
			writer.write(doc);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testFetchXML() {
		File file = new File("Files/jdbc-connection.xml");
		SAXReader reader = new SAXReader();

		try {
			Document doc = reader.read(file);
			Element root = doc.getRootElement();

			Element driverClass_element = root.element("driver-class");
			String driverClass = driverClass_element.getTextTrim();
			System.out.println("driverClass=" + driverClass);

			Element url_element = (Element) root.selectSingleNode("url");
			String url = url_element.getTextTrim();
			System.out.println("url=" + url);

			Element user_element = root.element("user");
			String user = user_element.getTextTrim();
			System.out.println("user=" + user);

			Element password_element = root.element("password");
			String password = password_element.getTextTrim();
			System.out.println("password=" + password);

		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
