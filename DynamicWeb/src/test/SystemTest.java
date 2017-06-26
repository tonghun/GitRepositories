package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 1.区分System.nanoTime()与System.currentTimeMillis();
 * 
 * 2.System.getProperty(String key):获取系统属性;
 * 
 * @author tonghuo
 *
 */
public class SystemTest {
	public static void main(String[] args) {

		long currentTime = System.currentTimeMillis();// 返回从某个固定时间点开始至当前的毫秒数
		long nanoTime = System.nanoTime();// 返回最准确的可用作系统计时的当前值，与钟表时间无关
		System.out.println("currentTime:" + currentTime);
		System.out.println("nanoTime:" + nanoTime);

		DateFormat format = new SimpleDateFormat("yyyy年-MM月-dd日 HH时mm分ss秒");

		Date currentDateInit = new Date(currentTime);

		String currentDate = format.format(currentDateInit);
		System.out.println("currentDate:" + currentDate);

		Date nanoDateInit = new Date(nanoTime);
		String nanoDate = format.format(nanoDateInit);
		System.out.println("nanoTime:" + nanoDate);

		System.out.println("getProperty获取系统属性---------------------");
		String javaVersion = System.getProperty("java.version");
		System.out.println("当前运行的JRE版本：" + javaVersion);
		String encoding = System.getProperty("file.encoding");
		System.out.println("系统默认编码格式：" + encoding);
	}

}
