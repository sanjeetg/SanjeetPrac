import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {

		String str = "ABCDABCBCBB";

		Map<Character, Integer> map = new HashMap<>();

		int maxCount = 0;
		for (Character c : str.toCharArray()) {
			Integer count = map.get(c);
			if (count == null) {
				count = 0;
			}
			map.put(c, ++count);
			if (maxCount < count) {
				maxCount = count;
			}
		}

		System.out.println(maxCount);
	}

}
