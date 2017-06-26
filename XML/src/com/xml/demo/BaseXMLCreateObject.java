package com.xml.demo;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import com.xml.beans.BaseXMLBean;

/**
 * 利用反射机制，根据XML配置文件创建对象
 * 
 * @author tonghuo
 *
 */
@SuppressWarnings("unused")
public class BaseXMLCreateObject {

	private Map<String, String> idMap;
	private Map<String, String> propertyMap;
	private String id;
	private String cla;

	/**
	 * 获取XML文档中的属性与属性值，以Map形式
	 * 
	 * @throws Exception
	 */
	@Before
	public void testParseXML() throws Exception {
		idMap = new HashMap<String, String>();
		propertyMap = new HashMap<String, String>();

		File file = new File("Files/baseXMLObject.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);

		Element root = doc.getRootElement();

		Attribute idAttr = root.attribute("id");
		id = idAttr.getValue();
		Attribute classAttr = root.attribute("class");
		cla = classAttr.getValue();

		List<Element> idList = new ArrayList<Element>();
		Element id_element = root.element("id");
		idList.add(id_element);
		idMap = getAttributeContent(idList, true);

		List<Element> elements = root.elements("property");

		propertyMap = getAttributeContent(elements, false);
	}

	/**
	 * 获取Map<propertyName,propertyValue>
	 * 
	 * @param es
	 * @param isId
	 * @return
	 */
	public Map<String, String> getAttributeContent(List<Element> es, boolean isId) {
		Map<String, String> map = new HashMap<String, String>();
		Attribute propertyAttr = null;
		String property = null;

		for (Element e : es) {
			if (isId) {
				propertyAttr = e.attribute("property");
				property = propertyAttr.getValue();
			} else {
				propertyAttr = e.attribute("name");
				property = propertyAttr.getValue();
			}
			System.out.print(property + "----");

			Attribute valueAttr = e.attribute("value");
			String value = valueAttr.getValue();
			System.out.println(value);

			map.put(property, value);
		}

		return map;
	}

	/**
	 * 1.怎么进行强制类型转化？ 2.怎么将配置文件中的id作为对象引用变量的名称？
	 * 
	 * @throws Exception
	 */
	@Test
	public void testBaseXMLObject() throws Exception {
		Class<?> c = Class.forName(cla);
		Object bean = c.newInstance();
		System.out.println("c=" + c);

		Map<String, Method> methodMap = new HashMap<String, Method>();
		Method[] methods = c.getMethods();
		for (Method m : methods) {
			String name = m.getName();
			// System.out.println("methodName=" + name);
			methodMap.put(name.toLowerCase(), m);
		}

		/**
		 * 为id属性赋值
		 */
		Set<String> idKeySet = idMap.keySet();
		String id = null;
		for (String x : idKeySet)
			id = x;
		Method setId = methodMap.get("set" + id);
		setId.invoke(bean, Integer.valueOf(idMap.get(id)));
		// System.out.println(bean);

		/**
		 * 为普通属性赋值
		 */
		Set<String> propertyKeySet = propertyMap.keySet();
		for (String property : propertyKeySet) {
			Method method = methodMap.get("set" + property);
			Class<?>[] parameterTypes = method.getParameterTypes();
			if (parameterTypes[0] == String.class) {
				method.invoke(bean, propertyMap.get(property));
			} else {
				method.invoke(bean, Integer.valueOf(propertyMap.get(property)));
			}
			// System.out.println(method);
		}
		System.out.println(bean);
	}

}
