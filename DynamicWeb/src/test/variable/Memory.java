package test.variable;

/**
 * 
 * @author tonghuo
 *
 *         1.���������֮�丳ֵ�����ǰ�һ�����������ô��ݸ���һ�����㣬�Ӵ���������ָ��ͬһ������
 */
public class Memory {

	private int a = 0;// ʵ�������洢�ڶ��ڴ�Ķ����У������������̹߳���ģ�����ʵ�������������̹߳���ģ���˴����̰߳�ȫ���⡣

	private static int b = 0;// ��̬�����������ʱ��������ʼ��������ڷ���������Ϊ�������������̹߳���ģ����Ծ�̬���������̰߳�ȫ���⡣

	private void doit() {
		int a = 0;// �ֲ������洢��ջ�У�ջ�ڲ������ݿ������ڲ���������������aʱ���ȼ���ջ���Ƿ����0�������򽫸ñ���ָ��0���������������ջ�п���һ���ռ���0��
	}

	public static void main(String[] args) {
		String s01 = new String("123");
		String s02 = null;

		System.out.println("s01==s02" + s01 == s02);
		s02 = s01;
		System.out.println("s01----" + s01);
		System.out.println("s02----" + s02);
		System.out.println("s01==s02" + s01 == s02);

		TestClass obj01 = new TestClass("A");
		TestClass obj02 = new TestClass("B");
		System.out.println("obj01----" + obj01);
		System.out.println("obj02----" + obj02);

		TestClass obj03 = obj01;
		obj02 = obj01;
		System.out.println("obj03----" + obj03);
		System.out.println("obj02----" + obj02);

		Class obj01C = obj01.getClass();
		String name01 = obj01C.getName();
		System.out.println("obj01C----className" + name01);

		Class obj02C = obj02.getClass();
		String name02 = obj02C.getName();
		System.out.println("obj02C----className" + name02);

		System.out.println("obj01==obj02----" + (obj01 == obj02));
	}

}

class TestClass {
	public TestClass(String name) {

	}

}