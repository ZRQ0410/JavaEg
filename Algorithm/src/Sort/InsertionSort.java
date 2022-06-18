package Sort;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		// 0~0����
		
		for (int i = 1; i < arr.length; i++) { // 0~i��������
			int temp = arr[i];
			int insertIndex = i - 1;
			while (insertIndex >= 0 && temp < arr[insertIndex]) {
				// �Ѵ��������һλ
				arr[insertIndex+1] = arr[insertIndex];
				insertIndex--;
			}
			// ��һ������tempС������ѭ������temp���뵽���������
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
