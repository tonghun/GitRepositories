package com.xml.parse;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

public class XPathTest {

	private Element root;
	private Document doc;

	@Before
	public void before() throws DocumentException {
		SAXReader reader = new SAXReader();
		doc = reader.read("Files/XPath.xml");
		root = doc.getRootElement();
	}

	/**
	 * parent.selectNodes(childNodeName)：获取具有指定名称的全部子节点
	 */
	@Test
	public void test01() {
		List<Node> children = root.selectNodes("book");
		System.out.println("子节点数目=" + children.size());
		for (Node n : children) {
			System.out.println("节点名=" + n.getName());
		}
	}

	/**
	 * 采用相对于根路径的绝对路径获取节点
	 */
	@Test
	public void test02() {
		// 根据索引获取节点：如果某一路径有多个同名的节点，根据索引选择其中一个。
		Element firstBookElement = (Element) doc.selectSingleNode("/bookstore/book[1]");
		String bookName = firstBookElement.attributeValue("name");// 直接根据属性名获取属性值
		System.out.println("bookName=" + bookName);
	}

	/**
	 * 不受路径限制获取文档中具有指定名称的全部节点
	 */
	@Test
	public void test03() {
		Element firstBookElement = (Element) root.selectSingleNode("book[1]");
		List<Node> allBookElements = firstBookElement.selectNodes("//book");
		for (Node x : allBookElements) {
			System.out.println("不受路径限制获取全部名为book的节点=" + x.getName());
			System.out.println(((Element) x).attributeValue("name"));
		}
	}

	/**
	 * 获取具有指定名称的全部后代节点
	 */
	@Test
	public void test04() {
		List<Node> bookstore_childBooks = doc.selectNodes("/bookstore/book//book");
		System.out.println("bookstore节点下名称为book的节点数目=" + bookstore_childBooks.size());
		for (Node x : bookstore_childBooks) {
			System.out.println(x.getName());
			System.out.println(((Element) x).attributeValue("name"));
		}
	}

	/**
	 * 不受路径限制，获取文档中具有指定名称与属性的全部节点
	 */
	@Test
	public void test05() {
		List<Node> bookstore_childBooks = doc.selectNodes("//book[@name]");
		System.out.println("bookstore节点下名称为book的节点数目=" + bookstore_childBooks.size());
		for (Node x : bookstore_childBooks) {
			System.out.println(x.getName());
			System.out.println(((Element) x).attributeValue("name"));
		}
	}

	/**
	 * 不受路径限制，获取文档中具有指定名称与指定属性值的全部节点
	 */
	@Test
	public void test06() {
		List<Node> bookstore_childBooks = doc.selectNodes("//book[@name='中国现代史']");
		System.out.println("bookstore节点下名称为book的节点数目=" + bookstore_childBooks.size());
		for (Node x : bookstore_childBooks) {
			// System.out.println(x.getName());
			System.out.println("order=" + ((Element) x).attributeValue("order"));
			System.out.println("name=" + ((Element) x).attributeValue("name"));
		}
	}

	/**
	 * 不受路径限制，获取文档中具有指定名称并且满足指定关系运算的全部节点
	 */
	@Test
	public void test07() {
		List<Node> bookstore_childBooks = doc.selectNodes("//book[@count>25]");
		System.out.println("bookstore节点下名称为book的节点数目=" + bookstore_childBooks.size());
		for (Node x : bookstore_childBooks) {
			// System.out.println(x.getName());
			System.out.println("order=" + ((Element) x).attributeValue("order"));
			System.out.println("name=" + ((Element) x).attributeValue("name"));
			System.out.println("count=" + ((Element) x).attributeValue("count"));
		}
	}

	/**
	 * 不受路径限制，获取文档中具有指定名称的全部属性
	 */
	@Test
	public void test08() {
		List<Node> attributes = doc.selectNodes("//@count");
		System.out.println("bookstore节点下名称为book的节点数目=" + attributes.size());
		for (Node x : attributes) {
			// System.out.println(x.getName());
			System.out.println("count=" + ((Attribute) x).getValue());
		}
	}

}
