import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, -5, 1, 2, -1 };
		System.out.println(Arrays.toString(zeroSumSubArray(arr)));

	}

	static Map<Integer, Integer> map = new HashMap<>();

	private static int[] zeroSumSubArray(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			Integer oldIndex = map.get(sum);
			if (oldIndex == null && i == arr.length - 1) {
				return null;
			} else if (oldIndex == null) {
				map.put(sum, i);
				sum += arr[i];
			} else {
				return Arrays.copyOfRange(arr, oldIndex, i);
			}
		}
		return null;
	}
}
