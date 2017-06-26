package spring.array;

public class ArrayObject {
	private int[] arr;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void showArr() {
		for (int x : arr)
			System.out.println(x);
	}

}
