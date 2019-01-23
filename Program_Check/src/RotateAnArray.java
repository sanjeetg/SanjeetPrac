import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = rotateArray(arr, 2);

		System.out.println(Arrays.toString(arr1));
	}

	private static int[] rotateArray(int arr[], int n) {
		n = n % arr.length;

		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int tempIndex = (n + i) % arr.length;
			arr1[i] = arr[tempIndex];
		}
		return arr1;
	}
}
