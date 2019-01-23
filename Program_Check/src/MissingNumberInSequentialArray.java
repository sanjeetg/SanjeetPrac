
public class MissingNumberInSequentialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 6 };

		int totalXor = 0;
		int arrXor = 0;

		for (int i = 1; i <= arr.length + 1; i++) {
			totalXor ^= i;

			System.out.println(totalXor);
		}

		for (int i : arr) {
			arrXor ^= i;
		}

		System.out.println(totalXor);
		System.out.println(arrXor);

		System.out.println(totalXor ^ arrXor);
	}

}
