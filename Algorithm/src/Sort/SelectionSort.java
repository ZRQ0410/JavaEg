package Sort;

public class SelectionSort { // O(n^2)
	
	// 数组N个元素(0 ~ N-1)
	// 先确定最左边（最小的数）
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) { // 0 ~ N-2
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				// 比较0,1 1,2 ... N-2,N-1
				minIndex = arr[j] < arr[i] ? arr[minIndex] : minIndex;
			}
		swap(arr, i, minIndex);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
}
