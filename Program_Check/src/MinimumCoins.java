
public class MinimumCoins {

	public static void main(String[] args) throws Exception {
		int coins[] = { 1, 2, 5, 10 };
		int x = 40;
		System.out.println("Result - " + change(x, coins));
	}

	public static int change(int x, int[] coins) throws Exception {
		if (x == 0)
			return 0;

		int min = x;
		for (int coin : coins) {
			if (x - coin >= 0) {
				int c = change(x - coin, coins);

				System.out.println("c - " + c);
				Thread.sleep(100);
				if (min > c + 1)
					min = c + 1;

				System.out.println("Min - " + min);
				Thread.sleep(100);
			}
		}
		return min;
	}
}
