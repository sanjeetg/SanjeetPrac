import java.util.Arrays;

public class ThreeSum {

	public ThreeSum() {
		return;
	}

	public static void main(String[] args) {

		ThreeSum obj = new ThreeSum();
		// int arr[] = { -1, 0, 1, 2, -1, -4 }; //// -4 -1 -1 0 1 2
		int arr[] = { 12, 3, 11, 2, 1, 7, 8 }; // 1 2 3 7 8 11 12

		// Arrays.sort(arr);
		// obj.threeSum(arr, 16);

		int mask = 0x000F;
		int value = 0x2222;
		System.out.println(value & mask);

	}

	private static void threeSum(int arr[], int sum) {
		int l, r;
		for (int i = 0; i < arr.length - 2; i++) {
			l = i + 1;
			r = arr.length - 1;

			while (l < r) {
				int tempSum = arr[i] + arr[l] + arr[r];
				if (tempSum == sum) {
					System.out.println("[" + arr[i] + " " + arr[l] + " " + arr[r] + "]");
					break;
				} else if (tempSum < sum) {
					l++;
				} else {
					r--;
				}
			}
		}
	}

}
