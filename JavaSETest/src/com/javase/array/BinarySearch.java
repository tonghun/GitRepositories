package com.javase.array;

import java.util.Arrays;

/**
 * ���ַ���������int�������飬����֮ǰ�����Ƚ������򣬷�������ȷ��
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
