import java.util.HashSet;
import java.util.Set;

public class LongestConsequitiveSequence {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 6, 9, 4, 3, 5 }; // 1,2,3,4,5,6

		int n = arr.length;
		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		int longest = 0;
		for (int i = 0; i < n; i++) {
			int counter = 0;
			if (!set.contains(arr[i] - 1)) {
				int val = arr[i];
				while (set.contains(val++)) {
					counter++;
				}
			}
			if (counter > longest) {
				longest = counter;
			}
		}
		System.out.println(longest);
	}
}
