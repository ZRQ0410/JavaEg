package Sort;

public class BubbleSort { // O(n^2)
	
	public static void bubbleSort(int[] arr) {
		
		// (0, N-1)
		// 先确定最右边（最大的数）
		if (arr == null || arr.length < 2) {
			return;
		}
		// 0~N-1, 0~N-2, 0~N-3...
		for (int e = arr.length - 1; e > 0; e--) {
			for (int i = 0; i < e; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
	}
	
	// 交换两数，用这种方法前提是两数不相等
	// 异或：不同为1, 相同为0
	// 0 ^ N = N; N ^ N = 0
	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	// test
	public static void main(String[] agrs) {
		int[] arr = {5,2,4,6,1,3};
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
