package test;

/**
 * 
 * @author tonghuo
 * 
 *         1.�ϵ�����ã��ϵ�����ʹ������Թ��̸��ӿ��ӣ�������ָ���ϵ��λ��ֹͣ�����Էֽ׶β鿴����ִ�������
 * 
 *         2.�������öϵ��Ԫ�ص����ͣ��϶����Է�Ϊ���ࣺ�жϵ㡢�����ϵ㡢�����ϵ㡢��ϵ㣬�ڷ��ʻ����޸���Щ�ϵ�ʱ���̹߳���
 * 
 *         3.������������ʾ����һ����ִ������д��룻
 * 
 *         4.�������룺��Է����ģ���ʾ��������ִ�з�����
 */
public class BreakpointTest {

	private static int count = 9;

	private static void printSome() {
		System.out.println("a0");
		System.out.println("a1");
		System.out.println("a2");
		System.out.println("a3");
		System.out.println(count);
	}

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);

		printSome();

		System.out.println(2);
		System.out.println(3);
	}

}
