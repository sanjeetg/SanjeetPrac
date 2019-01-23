
public class BinarySearchInSortedArry {

	public static void main(String[] args) {

		int arr[] = { 20, 40, 50, 60, 68, 70, 80, 89, 90, 95, 96, 98, 100 };

		int find = 68;

		System.out.println(find(arr, 0, arr.length - 1, find));
	}

	private static int find(int arr[], int l, int r, int find) {

		if (r >= l) {
			int m = (l + r) / 2;
			if (arr[m] == find) {
				return find;
			} else if (arr[m] > find) {
				return find(arr, l, m - 1, find);
			} else {
				return find(arr, m + 1, r, find);
			}
		}
		return -1;
	}
}
