
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("ABA"));
	}

	private static boolean isPalindrome(String str) {

		if (str.length() == 0 || str.length() == 1) {
			return true;
		}
		if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		}
		return isPalindrome(str.substring(1, str.length() - 1));
	}
}
