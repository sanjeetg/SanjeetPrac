import java.util.Arrays;

public class KthLargestElement {

	public static void heapSort(int arr[], int k) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
			System.out.println(Arrays.toString(arr));
		}

		for (int i = n - 1; i >= (n - (k - 1)); i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, i, 0);
			System.out.println();
			System.out.println(Arrays.toString(arr));
		}

	}

	private static void heapify(int arr[], int n, int i) {
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
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest);
		}

	}

	public static void main(String[] args) {
		// int arr[] = { 30, 20, 10, 50, 90, 70, 80, 40, 60 };
		int arr[] = { 35, 20, 40, 25, 50, 55, 45, 15, 60, 65 };
		heapSort(arr, 10);

		System.out.println(Arrays.toString(arr));

		System.out.println(arr[0]);
	}

}
