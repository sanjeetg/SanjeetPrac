import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCompression {

	public static void main(String[] args) {
		String str = "AABBCCCAAADDD";

		String regEx = "([A-Za-z])\\1*"; // \\1* look for given char again for zero or more times.

		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);

		StringBuilder compressedString = new StringBuilder();
		while (matcher.find()) {
			String grp = matcher.group();
			System.out.println(grp);
			compressedString.append(grp.length() + "" + grp.charAt(0));
		}

		System.out.println(compressedString);
	}

}
