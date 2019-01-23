
public class SumWithOutAnyArithmeticOperator {

	public static void main(String[] args) {

		System.out.println(sum(10, 20));
	}

	private static int sum(int a, int b) {
		if (b == 0) {
			return a;
		}

		int partialSum = a ^ b;
		int carry = (a & b) << 1;
		return sum(partialSum, carry);
	}
}
