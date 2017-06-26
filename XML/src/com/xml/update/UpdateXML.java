package com.xml.update;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class UpdateXML {

	public static void main(String[] args) {
		File file = new File("xmlTest01.xml");
		SAXReader reader = new SAXReader();

		try {
			Document doc = reader.read(file);
			Element root = doc.getRootElement();

			Element c01 = (Element) root.selectSingleNode("c01[@name01='value0201']");

			c01.setText(" ");
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("GBK");
			FileWriter fileWriter = new FileWriter(file);
			XMLWriter writer = new XMLWriter(fileWriter, format);
			writer.write(doc);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
