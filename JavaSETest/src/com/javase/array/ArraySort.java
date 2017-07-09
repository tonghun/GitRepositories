package com.javase.array;

import org.junit.Test;

/**
 * 数组排序方法：冒泡法、直接排序、反转排序
 * 
 * @author tonghuo
 *
 */
public class ArraySort {

	/**
	 * 对比相邻的两个元素，满足条件交换位置
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * 从未排序序列中筛选出最大值，放在未排序序列的尾部，关键是获取最大值的索引。
	 * 内层循环切入点：假设第一个即索引为0的元素为最大值，然后再将其余剩余元素进行对比，获取最大值。
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] directSort(int[] arr) {
		int len = arr.length;
		int index;
		for (int i = 1; i < len; i++) {
			index = 0;
			for (int j = 1; j <= len - i; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}
				int temp = arr[len - i];
				arr[len - i] = arr[index];
				arr[index] = temp;
			}
		}
		return arr;
	}

	/**
	 * 交换索引和为length-1的两个元素的位置
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] reverseSort(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

	@Test
	public void testBubble() {
		int[] arr = { 2, 4, 6, 3, 15, 10, 7, 5, 2 };
		int[] ascArr = bubbleSort(arr);
		for (int x : ascArr) {
			System.out.println(x);
		}
	}

	@Test
	public void testDirect() {
		int[] arr = { 2, 4, 6, 3, 15, 10, 7, 5, 2 };
		int[] ascArr = directSort(arr);
		for (int x : ascArr) {
			System.out.println(x);
		}
	}

	@Test
	public void testReverse() {
		int[] arr = { 2, 4, 6, 3, 15, 10, 7, 5, 2 };
		int[] ascArr = reverseSort(arr);
		for (int x : ascArr) {
			System.out.println(x);
		}
	}

}
