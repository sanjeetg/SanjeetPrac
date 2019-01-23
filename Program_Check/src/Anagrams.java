import java.util.HashMap;
import java.util.Map;

//check if the letters of the word are of same in count
public class Anagrams {

	public static void main(String[] args) {
		System.out.println(checkAnagram("ABCD", "ABCD"));

	}

	private static boolean checkAnagram(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();

		for (Character c : s1.toCharArray()) {
			Integer val = map.get(c);
			if (val != null) {
				map.put(c, ++val);
			} else {
				map.put(c, 1);
			}
		}

		for (Character c : s2.toCharArray()) {
			Integer val = map.get(c);
			if (val == null) {
				return false;
			} else {
				if (val == 1) {
					map.remove(c);
				} else {
					map.put(c, --val);
				}
			}
		}
		return true;
	}

}
