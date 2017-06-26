package test.Arrays;

public class ArraysSort {

	/**
	 * 冒泡法排序的基本思想：对比相邻的两个元素，如果符合条件，则交换位置，最后把小的元素放在前面，大的元素放在后面，实现升序排列。
	 * 
	 * 
	 * 具体操作：双层循环：外循环控制循环轮数，内循环具体对比对比元素，交换位置。循环轮数是n-1，内层循环次数随着循环轮数的增加而减少。
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] bubble(int[] arr) {

		for (int i = 1; i < arr.length; i++) {// 循环轮数
			for (int j = 0; j < arr.length - i; j++) {// 具体执行元素的对比与交换
				// 满足条件，交换位置
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
	 * 直接选择排序的基本思想：从未排序元素中找到最大元素，将该元素放到全体未排序元素的最大索引处，核心是找到当前最大元素的索引。
	 * 
	 * 
	 * 基本操作：由于以最大元素为对象进行排序，所以第一个元素最后排序，可以假定第一个元素是当前所有未排序元素的最大值，然后将该元素与剩余元素比较。
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] direct(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int index = 0;
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[index] < arr[j])
					index = j;
			}

			int temp = arr[index];
			arr[index] = arr[arr.length - i];
			arr[arr.length - i] = temp;
		}

		return arr;
	}

	/**
	 * 反转排序的基本思想：交换首尾对应索引元素的位置。
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 9, 3, 6, 8 };

		int[] resArr01 = ArraysSort.bubble(arr);
		System.out.println("----冒泡法排序的结果----");
		for (int x : resArr01)
			System.out.println(x);

		int[] arr01 = new int[] { 9, 5, 7, 23, 88 };
		int[] resArr02 = ArraysSort.direct(arr01);
		System.out.println("----直接选择排序的结果----");
		for (int x : resArr02)
			System.out.println(x);

		System.out.println("----原始数组arr中的元素排序----");
		for (int x : arr)
			System.out.println(x);

		int[] arr02 = new int[] { 2, 10, 50, 21, 18 };
		int[] resArr03 = ArraysSort.reverse(arr02);
		System.out.println("----反转选择排序的结果----");
		for (int x : resArr03)
			System.out.println(x);
	}
}
