package spring.properties01;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new FileSystemXmlApplicationContext("src/spring/properties01/Properties.xml");// ����Ŀ���ڵ�Ŀ¼Ϊ��Ŀ¼
		Prop p = (Prop) factory.getBean("pop");
		Properties pro = p.getPop();
		String s01 = pro.getProperty("name01");
		System.out.println("name01:" + s01);

		Set<String> set = p.getSet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println("set������:" + s);
		}
	}
}
