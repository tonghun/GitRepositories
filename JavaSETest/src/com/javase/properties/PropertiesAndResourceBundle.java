package com.javase.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import org.junit.Test;

/**
 * 读取属性文件的几种方式
 * 
 * @author tonghuo
 *
 */
public class PropertiesAndResourceBundle {

	/**
	 * 基于输入流读取属性文件：Properties继承了Hashtable，底层将key/value键值对存储在集合中，
	 * 通过put方法可以向集合中添加键值对或者修改key对应的value
	 * 
	 * @throws IOException
	 */
	@SuppressWarnings("rawtypes")
	@Test
	public void test01() throws IOException {
		FileInputStream fis = new FileInputStream("Files/test01.properties");
		Properties props = new Properties();
		props.load(fis);// 将文件的全部内容读取到内存中，输入流到达结尾
		fis.close();// 加载完毕，就不再使用输入流，程序未主动关闭，需要手动关闭

		/*byte[] buf = new byte[1024];
		int length = fis.read(buf);
		System.out.println("content=" + new String(buf, 0, length));//抛出StringIndexOutOfBoundsException*/

		System.out.println("driver=" + props.getProperty("jdbc.driver"));
		System.out.println("url=" + props.getProperty("jdbc.url"));
		System.out.println("username=" + props.getProperty("jdbc.username"));
		System.out.println("password=" + props.getProperty("jdbc.password"));

		/**
		 * Properties其他可能用到的方法
		 */
		props.put("serverTimezone", "UTC");// 底层通过hashtable.put(key,value)
		props.put("jdbc.password", "456");
		FileOutputStream fos = new FileOutputStream("Files/test02.xml");// 将Hashtable中的数据写入xml文件中
		props.storeToXML(fos, "来自属性文件的数据库连接四要素");

		System.out.println();
		System.out.println("遍历属性文件");
		System.out.println("hashtable中键值对数目=" + props.size());
		Enumeration keys = props.propertyNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println(key + "=" + props.getProperty(key));
		}

	}

	/**
	 * 基于类读取属性文件：该方法将属性文件当作类来处理，属性文件放在包中，使用属性文件的全限定性而非路径来指代文件
	 */
	@Test
	public void test02() {
		ResourceBundle bundle = ResourceBundle.getBundle("com.javase.properties.test01");
		System.out.println("获取指定key的值");
		System.out.println("driver=" + bundle.getString("jdbc.driver"));
		System.out.println("url=" + bundle.getString("jdbc.url"));
		System.out.println("username=" + bundle.getString("jdbc.username"));
		System.out.println("password=" + bundle.getString("jdbc.password"));

		System.out.println("-----------------------------");
		System.out.println("遍历属性文件");
		Enumeration<String> keys = bundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + "=" + bundle.getString(key));
		}
	}
}
