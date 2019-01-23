import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 8, 9, 10, 12 };
		int arr2[] = { 1, 2, 4, 7, 11, 14, 15 };
		int a = arr1.length;
		int b = arr2.length;
		Integer arr3[] = new Integer[a + b];

		arr3 = getCombinedArray(arr1, a, arr2, b, arr3);

		System.out.println(Arrays.asList(arr3).toString());

	}

	public static Integer[] getCombinedArray(int arr1[], int a, int arr2[], int b, Integer arr3[]) {
		int i = 0, j = 0, k = 0;

		while (i < a && j < b) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		while (i < a) {
			arr3[k++] = arr1[i++];
		}

		while (j < b) {
			arr3[k++] = arr2[j++];
		}

		return arr3;
	}

}
