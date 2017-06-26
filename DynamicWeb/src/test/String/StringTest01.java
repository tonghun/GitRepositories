package test.String;

import java.sql.Connection;
import java.sql.Statement;

import test.JDBC.JDBCVariable;

/**
 * 1.如果一个字符串中含有变量，而且为了保持该字符串的语义，该字符串不可以被拆分，
 * 即不可以通过"+"连接，那么怎么处理该字符串中的变量，使得该变量不会被当做普通字符来处理； 2.处理方式：采用三引号+两加号的格式：'"+arg+"';
 * 
 * @author tonghuo
 *
 */
public class StringTest01 {
	public static void main(String[] args) {
		System.out.println("当双引号中出现的变量为数字时：");
		int a = 5;
		int b = 6;
		System.out.println("当双引号中出现数字变量时:'" + a + "'+'" + b + "'");// 保持了语义的完成，变量a与变量b依然在双引号中

		String tempS = "字符串";
		String temp = "" + tempS + "";
		System.out.println("tempS----" + tempS);

		System.out.println("当双引号中出现的变量为字符串时：");
		String s = new String("字符");
		System.out.println("当双引号中出现字符串时:" + s + "");// 破坏了语义，现在的格式：变量s脱离了原来的双引号，整体已经变成了单纯的字符串连接，失去了原有的语义

		String name = "作者名称";
		double price = 1223.333;
		int bookCount = 1000;
		String author = "图书作者";

		String sql = "insert into tb_books(name,price,bookCount,author)	values(" + name + "," + price + "," + bookCount
				+ "," + author + ")";

		System.out.println("sql----" + sql);

	}
}
