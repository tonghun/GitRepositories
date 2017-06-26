package xml;

import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 演示XML常用方法
 * 
 * @author tonghuo
 *
 */
public class XML01 {
	public static void main(String[] args) throws Exception {

		final String PATH = "D:\\Program Files\\JAVA\\JavaEE Projects\\DynamicWeb\\WebContent\\XML\\test02.xml";
		File file = new File(PATH);

		System.out.println("开始创建XML文档----------------");
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("rootName");// 直接利用文档对象创建根节点，由于只有一个根节点，所以此方法只能调用一次
		// Element e01 = doc.addElement("e01");
		root.addComment("根节点注释");

		Element node01 = root.addElement("node01");
		node01.setText("node01节点的内容");
		node01.addComment("node01的注释");
		node01.addAttribute("id", "1");
		Element node0101 = node01.addElement("node0101");
		node0101.setText("这是节点node0101");

		Element node02 = root.addElement("node02");
		node02.setText("node02节点的内容");
		Element node03 = root.addElement("node03");
		node03.setText("node03节点的内容");
		// node02.addComment("节点node02的注释");
		// int childNodeCount = root.nodeCount();

		OutputFormat format = OutputFormat.createPrettyPrint();
		// format.setEncoding("UTF-8");

		FileOutputStream output = new FileOutputStream(PATH);

		try {
			XMLWriter writer = new XMLWriter(output, format);
			writer.write(doc);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SAXReader reader = new SAXReader();
		Document doc01 = null;
		Element root01 = null;
		try {
			doc01 = reader.read(file);
			root01 = doc01.getRootElement();

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("开始解析XML文档----------------");
		String rootName = root01.getName();
		System.out.println("rootName----" + rootName);

		Element ele = root01.element("node01");
		System.out.println(ele.getName());

		int childNodeCount = ele.nodeCount();
		System.out.println(ele.getName() + "子节点数目：" + childNodeCount);

		for (int i = 0; i < 5; i++) {
			Node node = ele.node(i);
			// System.out.println(i);
			if (node instanceof Text) {
				System.out.println(i);
				System.out.println("这是一个文本：" + node.getPath());
			}

			if (node instanceof Comment) {
				System.out.println(i);
				System.out.println("这是一个注释：" + node.getText());
			}
		}

		/**
		 * 通过路径选择节点时操作对象可以是文件对象、根节点、父节点；
		 */
		System.out.println("修改文档------------------");
		Element selectedNode01 = (Element) root01.selectSingleNode("/rootName/node01");// 通过路径XPathExpression选择节点
		System.out.println("selectedNode01的name:" + selectedNode01.getName());

		Element selectedNode02 = (Element) doc.selectSingleNode("/rootName/node01");
		System.out.println("selectedNode02的name:" + selectedNode02.getName());

		Element selectedNode03 = (Element) selectedNode02.selectSingleNode("node0101");
		System.out.println("selectedNode03的name:" + selectedNode03.getName());

	}

}
