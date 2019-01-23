
public class SecondLargestElement {

	private static void secondLargest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int secondLarget = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLarget = largest;
				largest = arr[i];
			}
			if (arr[i] > secondLarget && largest != arr[i]) {
				secondLarget = arr[i];
			}
		}

		System.out.println(largest);
		System.out.println(secondLarget);
	}

	public static void main(String[] args) {
		int arr[] = { 30, 20, 10, 50, 90, 70, 80, 40, 60 };
		secondLargest(arr);
	}

}
