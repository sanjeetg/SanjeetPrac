package verify;

public class MinimumCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 3, 2, 1 };

		int amount = 31;

		int minCoin = minCoin(arr, amount);

		System.out.println(minCoin);

	}

	private static int minCoin(int arr[], int amount) {
		int minCoin = 0;
		if (amount == 0) {
			return minCoin;
		}

		for (int i = 0; i < arr.length; i++) {
			if (amount % arr[i] == 0) {
				minCoin = amount / arr[i];
				return minCoin;
			} else {
				minCoin = amount / arr[i];
				amount = amount % arr[i];
				return minCoin(arr, amount);
			}
		}
		return minCoin;
	}

}
