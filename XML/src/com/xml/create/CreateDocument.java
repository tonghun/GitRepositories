package com.xml.create;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class CreateDocument {
	public static void main(String[] args) {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("root");

		Element c01_element = root.addElement("c01");
		c01_element.setText("c01�ڵ������");
		c01_element.addComment("this is the comment of c01_element");
		c01_element.addAttribute("name01", "value01");
		c01_element.addAttribute("name02", "value02");

		Element c0101_element = root.addElement("c01");
		c0101_element.setText("c0101�ڵ������");
		c0101_element.addComment("this is the comment of c0101_element");
		c0101_element.addAttribute("name01", "value0201");
		c0101_element.addAttribute("name02", "value0202");

		Element c02_element = root.addElement("c02");
		c02_element.addCDATA("2323232323<>&'\"");

		File file = new File("Files/xmlTest01.xml");
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath----" + absolutePath);

		try {
			FileWriter fileWriter = new FileWriter(file);
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("GBK");
			XMLWriter writer = new XMLWriter(fileWriter, format);
			writer.write(doc);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
