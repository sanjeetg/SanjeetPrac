
public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		printPermutation("", str);

	}

	private static void printPermutation(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			char prefix1 = str.charAt(i);

			printPermutation(prefix + prefix1, str.substring(0, i) + str.substring(i + 1));
		}
	}
}
