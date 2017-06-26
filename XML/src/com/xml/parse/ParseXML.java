package com.xml.parse;

import java.io.File;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class ParseXML {
	public static void main(String[] args) {

		SAXReader reader = new SAXReader();
		File file = new File("Files/xmlTest01.xml");
		try {
			Document doc = reader.read(file);
			Element root = doc.getRootElement();

			Node c0101 = root.selectSingleNode("c01");
			System.out.println("c0101_text----" + c0101.getText());

			Node c0101_element = root.selectSingleNode("/root/c01[@name01='value0201']");
			System.out.println("c0101_element_text----" + c0101_element.getText());

			Element c01_element = root.element("c01");

			String c01_text = c01_element.getTextTrim();
			System.out.println("c01_text----" + c01_text);

			Attribute attribute01 = c01_element.attribute(0);
			String value01 = attribute01.getValue();
			System.out.println("value01----" + value01);

			List<Attribute> attributes = c01_element.attributes();
			for (Attribute x : attributes)
				System.out.println(x.getValue());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
