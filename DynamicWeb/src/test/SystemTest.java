package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.����System.nanoTime()��System.currentTimeMillis();
 * 
 * 2.System.getProperty(String key):��ȡϵͳ����;
 * 
 * @author tonghuo
 *
 */
public class SystemTest {
	public static void main(String[] args) {

		long currentTime = System.currentTimeMillis();// ���ش�ĳ���̶�ʱ��㿪ʼ����ǰ�ĺ�����
		long nanoTime = System.nanoTime();// ������׼ȷ�Ŀ�����ϵͳ��ʱ�ĵ�ǰֵ�����ӱ�ʱ���޹�
		System.out.println("currentTime:" + currentTime);
		System.out.println("nanoTime:" + nanoTime);

		DateFormat format = new SimpleDateFormat("yyyy��-MM��-dd�� HHʱmm��ss��");

		Date currentDateInit = new Date(currentTime);

		String currentDate = format.format(currentDateInit);
		System.out.println("currentDate:" + currentDate);

		Date nanoDateInit = new Date(nanoTime);
		String nanoDate = format.format(nanoDateInit);
		System.out.println("nanoTime:" + nanoDate);

		System.out.println("getProperty��ȡϵͳ����---------------------");
		String javaVersion = System.getProperty("java.version");
		System.out.println("��ǰ���е�JRE�汾��" + javaVersion);
		String encoding = System.getProperty("file.encoding");
		System.out.println("ϵͳĬ�ϱ����ʽ��" + encoding);
	}

}
