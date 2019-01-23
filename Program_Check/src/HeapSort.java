import java.util.Arrays;

public class HeapSort {

	void heapsort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapifyLargest(arr, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapifyLargest(arr, i, 0);
		}
	}

	void heapifyLargest(int arr[], int n, int i) {
		int largest = i;
		int leftIndex = largest * 2 + 1;
		int rightIndex = largest * 2 + 2;

		if (leftIndex < n && arr[leftIndex] > arr[largest]) {
			largest = leftIndex;
		}
		if (rightIndex < n && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapifyLargest(arr, n, largest);

		}
	}

	public static void main(String[] args) {
		int arr[] = { 50, 30, 23, 56, 34, 12, 43 };
		HeapSort sort = new HeapSort();
		sort.heapsort(arr);

		System.out.println(Arrays.toString(arr));

	}

}
