
public class FindElementInSortedMatrix {

	public static void main(String[] args) {

		int i = 4, j = 4;
		int[][] matrix = new int[i][j];
		int find = 10;
		System.out.println(find(matrix, find));
	}

	private static boolean find(int matrix[][], int find) {
		int row = 0;
		int col = matrix.length - 1;

		while (row < matrix[0].length && col >= 0) {
			int temp = matrix[row][col];
			if (temp == find) {
				return true;
			} else if (temp < find) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}

}
