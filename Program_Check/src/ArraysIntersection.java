
public class ArraysIntersection {

	public static void main(String[] args) {

		int arr1[] = { 2, 4, 8, 10, 12, 14, 16, 20 };
		int arr2[] = { 1, 4, 12, 15, 18, 24, 40 };
		int arr3[] = { 4, 12, 18, 20, 25, 30, 35 };

		int c1 = 0, c2 = 0, c3 = 0;

		while (c1 < arr1.length && c2 < arr2.length && c3 < arr3.length) {
			if (arr1[c1] == arr2[c2] && arr2[c2] == arr3[c3]) {
				System.out.println("Intersection " + arr1[c1]);
				c1++;
				c2++;
				c3++;
			} else if (arr1[c1] < arr2[c2]) {
				c1++;
			} else if (arr2[c2] < arr3[c3]) {
				c2++;
			} else {
				c3++;
			}
		}
	}

}
