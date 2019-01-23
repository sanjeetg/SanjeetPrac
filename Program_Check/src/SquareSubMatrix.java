
public class SquareSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[3][3];
		System.out.println(subArray(arr));

	}

	private static int subArray(int arr[][]) {
		int max = 0;

		int x = arr.length;
		int y = arr[0].length;

		int tempArr[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i == 0 || j == 0) {
					tempArr[i][j] = arr[i][j];
				} else if (arr[i][j] == 1) {
					tempArr[i][j] = Math.min(Math.min(tempArr[i - 1][j - 1], tempArr[i - 1][j]), tempArr[i][j - 1]) + 1;
				}
				if (tempArr[i][j] > max) {
					max = tempArr[i][j];
				}
			}
		}

		return max;
	}
}
