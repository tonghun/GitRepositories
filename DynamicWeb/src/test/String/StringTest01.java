package test.String;

import java.sql.Connection;
import java.sql.Statement;

import test.JDBC.JDBCVariable;

/**
 * 1.���һ���ַ����к��б���������Ϊ�˱��ָ��ַ��������壬���ַ��������Ա���֣�
 * ��������ͨ��"+"���ӣ���ô��ô������ַ����еı�����ʹ�øñ������ᱻ������ͨ�ַ������� 2.����ʽ������������+���Ӻŵĸ�ʽ��'"+arg+"';
 * 
 * @author tonghuo
 *
 */
public class StringTest01 {
	public static void main(String[] args) {
		System.out.println("��˫�����г��ֵı���Ϊ����ʱ��");
		int a = 5;
		int b = 6;
		System.out.println("��˫�����г������ֱ���ʱ:'" + a + "'+'" + b + "'");// �������������ɣ�����a�����b��Ȼ��˫������

		String tempS = "�ַ���";
		String temp = "" + tempS + "";
		System.out.println("tempS----" + tempS);

		System.out.println("��˫�����г��ֵı���Ϊ�ַ���ʱ��");
		String s = new String("�ַ�");
		System.out.println("��˫�����г����ַ���ʱ:" + s + "");// �ƻ������壬���ڵĸ�ʽ������s������ԭ����˫���ţ������Ѿ�����˵������ַ������ӣ�ʧȥ��ԭ�е�����

		String name = "��������";
		double price = 1223.333;
		int bookCount = 1000;
		String author = "ͼ������";

		String sql = "insert into tb_books(name,price,bookCount,author)	values(" + name + "," + price + "," + bookCount
				+ "," + author + ")";

		System.out.println("sql----" + sql);

	}
}
