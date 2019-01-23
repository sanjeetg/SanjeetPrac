
public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(checkPrime(191777137));
		System.out.println(checkPrimeRecursion(191777137, 3));

	}

	private static boolean checkPrime(int n) {
		if (n == 1 || n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i < n; i = i + 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkPrimeRecursion(int num, int n) {

		if (num == 1 || num == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		if (num % n == 0) {
			return false;
		}
		if (n * n < num) {
			return checkPrimeRecursion(num, n + 2);
		}
		return true;
	}
}
