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
 * ��ʾXML���÷���
 * 
 * @author tonghuo
 *
 */
public class XML01 {
	public static void main(String[] args) throws Exception {

		final String PATH = "D:\\Program Files\\JAVA\\JavaEE Projects\\DynamicWeb\\WebContent\\XML\\test02.xml";
		File file = new File(PATH);

		System.out.println("��ʼ����XML�ĵ�----------------");
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("rootName");// ֱ�������ĵ����󴴽����ڵ㣬����ֻ��һ�����ڵ㣬���Դ˷���ֻ�ܵ���һ��
		// Element e01 = doc.addElement("e01");
		root.addComment("���ڵ�ע��");

		Element node01 = root.addElement("node01");
		node01.setText("node01�ڵ������");
		node01.addComment("node01��ע��");
		node01.addAttribute("id", "1");
		Element node0101 = node01.addElement("node0101");
		node0101.setText("���ǽڵ�node0101");

		Element node02 = root.addElement("node02");
		node02.setText("node02�ڵ������");
		Element node03 = root.addElement("node03");
		node03.setText("node03�ڵ������");
		// node02.addComment("�ڵ�node02��ע��");
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

		System.out.println("��ʼ����XML�ĵ�----------------");
		String rootName = root01.getName();
		System.out.println("rootName----" + rootName);

		Element ele = root01.element("node01");
		System.out.println(ele.getName());

		int childNodeCount = ele.nodeCount();
		System.out.println(ele.getName() + "�ӽڵ���Ŀ��" + childNodeCount);

		for (int i = 0; i < 5; i++) {
			Node node = ele.node(i);
			// System.out.println(i);
			if (node instanceof Text) {
				System.out.println(i);
				System.out.println("����һ���ı���" + node.getPath());
			}

			if (node instanceof Comment) {
				System.out.println(i);
				System.out.println("����һ��ע�ͣ�" + node.getText());
			}
		}

		/**
		 * ͨ��·��ѡ��ڵ�ʱ��������������ļ����󡢸��ڵ㡢���ڵ㣻
		 */
		System.out.println("�޸��ĵ�------------------");
		Element selectedNode01 = (Element) root01.selectSingleNode("/rootName/node01");// ͨ��·��XPathExpressionѡ��ڵ�
		System.out.println("selectedNode01��name:" + selectedNode01.getName());

		Element selectedNode02 = (Element) doc.selectSingleNode("/rootName/node01");
		System.out.println("selectedNode02��name:" + selectedNode02.getName());

		Element selectedNode03 = (Element) selectedNode02.selectSingleNode("node0101");
		System.out.println("selectedNode03��name:" + selectedNode03.getName());

	}

}
