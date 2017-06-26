package test.Arrays;

import java.util.List;

/*
 * ����Arrays.asList()����������ת��Ϊ���ϣ�Ŀ���Ǳ��ڲ�ѯ��
 */
public class Arrays {
	public static void main(String[] args) {
		String s = "�й�,����,�ձ�,����";
		String[] sArr = s.split(",");
		System.out.println("�ַ����ָ�Ľ��");
		for (String x : sArr)
			System.out.println(x);
		System.out.println("ת��ΪList�Ժ�");
		List<String> list = java.util.Arrays.asList(sArr);
		for (String x : list)
			System.out.println(x);

		System.out.println("...............��ѯ�ַ���...................");
		boolean res01 = Arrays.equals(sArr, "�й�1");
		System.out.println("res:" + res01);

		System.out.println("...........��ѯ������������............");
		Integer[] tArr = new Integer[] { 1, 2, 3 };
		boolean res02 = Arrays.equals(tArr, 9);
		System.out.println("res02:" + res02);
		
	}

	public static <T> boolean equals(T[] arr, T s) {
		for (T x : arr) {
			if (x.equals(s) || x == s)
				return true;
		}
		return false;
	}

}
