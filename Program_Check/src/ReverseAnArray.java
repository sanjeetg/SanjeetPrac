
public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int reverseArr[] = reverseArr(arr);

		for (Integer i : reverseArr) {
			System.out.print(i + " ");
		}

	}

	private static int[] reverseArr(int arr[]) {

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

}
