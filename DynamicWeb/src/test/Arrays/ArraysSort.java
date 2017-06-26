package test.Arrays;

public class ArraysSort {

	/**
	 * ð�ݷ�����Ļ���˼�룺�Ա����ڵ�����Ԫ�أ���������������򽻻�λ�ã�����С��Ԫ�ط���ǰ�棬���Ԫ�ط��ں��棬ʵ���������С�
	 * 
	 * 
	 * ���������˫��ѭ������ѭ������ѭ����������ѭ������ԱȶԱ�Ԫ�أ�����λ�á�ѭ��������n-1���ڲ�ѭ����������ѭ�����������Ӷ����١�
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] bubble(int[] arr) {

		for (int i = 1; i < arr.length; i++) {// ѭ������
			for (int j = 0; j < arr.length - i; j++) {// ����ִ��Ԫ�صĶԱ��뽻��
				// ��������������λ��
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
	 * ֱ��ѡ������Ļ���˼�룺��δ����Ԫ�����ҵ����Ԫ�أ�����Ԫ�طŵ�ȫ��δ����Ԫ�ص�������������������ҵ���ǰ���Ԫ�ص�������
	 * 
	 * 
	 * �������������������Ԫ��Ϊ��������������Ե�һ��Ԫ��������򣬿��Լٶ���һ��Ԫ���ǵ�ǰ����δ����Ԫ�ص����ֵ��Ȼ�󽫸�Ԫ����ʣ��Ԫ�رȽϡ�
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
	 * ��ת����Ļ���˼�룺������β��Ӧ����Ԫ�ص�λ�á�
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
		System.out.println("----ð�ݷ�����Ľ��----");
		for (int x : resArr01)
			System.out.println(x);

		int[] arr01 = new int[] { 9, 5, 7, 23, 88 };
		int[] resArr02 = ArraysSort.direct(arr01);
		System.out.println("----ֱ��ѡ������Ľ��----");
		for (int x : resArr02)
			System.out.println(x);

		System.out.println("----ԭʼ����arr�е�Ԫ������----");
		for (int x : arr)
			System.out.println(x);

		int[] arr02 = new int[] { 2, 10, 50, 21, 18 };
		int[] resArr03 = ArraysSort.reverse(arr02);
		System.out.println("----��תѡ������Ľ��----");
		for (int x : resArr03)
			System.out.println(x);
	}
}
