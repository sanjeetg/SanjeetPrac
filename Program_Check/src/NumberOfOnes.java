
public class NumberOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(3 & 1);
		System.out.println(getNumberOfOnes(10));
	}

	private static int getNumberOfOnes(int x) {

		int sum = 0;

		/*
		 * while (x > 0) { if (x % 2 == 1) { sum++; } x = x >> 1; }
		 */

		while (x > 0) {
			sum += x & 1;
			System.out.println(x & 1);
			x >>= 1;
			System.out.println("X - " + x);
		}
		return sum;

	}

}
