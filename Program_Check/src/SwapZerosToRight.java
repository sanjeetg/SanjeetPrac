import java.util.Arrays;

public class SwapZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 0, 2, 0, 3, 2, 10, 1, 0, 2 };

		System.out.println(Arrays.toString(arr));
		int left = 0, right = arr.length - 1;

		while (left < right) {
			switch (arr[left]) {
			case 0:
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				break;
			default:
				left++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
