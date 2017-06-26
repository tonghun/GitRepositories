package com.xml.parse;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * 遍历具有指定名称的子节点
 * 
 * @author tonghuo
 *
 */
public class ForEachXML {

	@Test
	public void testForEachXML01() {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read("Files/XPath.xml");
			Element root = doc.getRootElement();
			Iterator<Element> it = root.elementIterator("book");
			while (it.hasNext()) {
				Element element = it.next();
				System.out.println(element.attributeValue("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testForEachXML02() {
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read("Files/XPath.xml");
			Node first_book_element = doc.selectSingleNode("/bookstore/book[1]");
			Iterator<Element> it = ((Element) first_book_element).elementIterator("book");
			while (it.hasNext()) {
				Element element = it.next();
				System.out.println(element.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
