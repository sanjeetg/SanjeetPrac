package verify;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 4, 12, 9, 10, 6 };
		MergeSort ms = new MergeSort();
		ms.sort(arr);
	}

}

class MergeSort {
	public void sort(int arr[]) {
		int start = 0;
		int end = arr.length - 1;

		int finalSortedArray[] = doMerge(arr, start, end);
		System.out.println(Arrays.toString(finalSortedArray));

	}

	private int[] doMerge(int arr[], int start, int end) {

		if (arr == null || arr.length == 0) {
			return arr;
		}
		int mid = (end - start) / 2;

		int leftArray[] = Arrays.copyOfRange(arr, start, mid);
		int rightArray[] = Arrays.copyOfRange(arr, mid + 1, end);

		int sortedArray[] = merge(leftArray, rightArray, leftArray.length, rightArray.length);
		return sortedArray;

	}

	private int[] merge(int leftArr[], int rightArr[], int l, int r) {

		int left = 0;
		int right = 0;
		int temp = 0;

		int sortedArra[] = new int[l + r];
		while (left < l && right < r) {
			if (leftArr[left] < rightArr[right]) {
				sortedArra[temp++] = leftArr[left++];

			} else {
				sortedArra[temp++] = rightArr[right++];
			}
		}

		while (left < l) {
			sortedArra[temp++] = leftArr[left++];
		}

		while (right < r) {
			sortedArra[temp++] = rightArr[right++];
		}
		return sortedArra;

	}
}
