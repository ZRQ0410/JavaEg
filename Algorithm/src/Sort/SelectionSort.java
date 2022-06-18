package Sort;

public class SelectionSort { // O(n^2)
	
	// 数组N个元素(0 ~ N-1)
	// 先确定最左边（最小的数）
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) { // 0~N-2
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				// 比较0,1 1,2 ... N-2,N-1
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			
			swap(arr, i, minIndex);
		
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	// test
	public static void main(String[] agrs) {
		int[] arr = {5,2,4,6,1,3};
		selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
