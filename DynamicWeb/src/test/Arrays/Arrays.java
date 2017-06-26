package test.Arrays;

import java.util.List;

/*
 * 借助Arrays.asList()方法将数组转化为集合，目的是便于查询。
 */
public class Arrays {
	public static void main(String[] args) {
		String s = "中国,美国,日本,韩国";
		String[] sArr = s.split(",");
		System.out.println("字符串分割的结果");
		for (String x : sArr)
			System.out.println(x);
		System.out.println("转化为List以后");
		List<String> list = java.util.Arrays.asList(sArr);
		for (String x : list)
			System.out.println(x);

		System.out.println("...............查询字符串...................");
		boolean res01 = Arrays.equals(sArr, "中国1");
		System.out.println("res:" + res01);

		System.out.println("...........查询基本数据类型............");
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
