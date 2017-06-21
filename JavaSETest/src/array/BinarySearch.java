package array;

import java.util.Arrays;

/**
 * 二分法用于搜索int类型数组，搜索之前必须先进行排序，否则结果不确定
 * 
 * @author tonghuo
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 8, 4, 7, 5 };
		System.out.println("length----" + arr.length);
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 3);
		System.out.println("index---......" + index);
	}

}
