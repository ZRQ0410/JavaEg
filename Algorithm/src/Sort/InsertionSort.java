package Sort;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		// 0~0有序
		
		for (int i = 1; i < arr.length; i++) { // 0~i做到有序
			int temp = arr[i];
			int insertIndex = i - 1;
			while (insertIndex >= 0 && temp < arr[insertIndex]) {
				// 把大的数后移一位
				arr[insertIndex+1] = arr[insertIndex];
				insertIndex--;
			}
			// 当一个数比temp小，跳出循环，把temp插入到这个数后面
			arr[insertIndex+1] = temp;
		}
	}
	
	// test
	public static void main(String[] agrs) {
		int[] arr = {5,2,4,6,1,3};
		insertionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
