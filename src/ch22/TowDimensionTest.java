package ch22;

public class TowDimensionTest {

	public static void main(String[] args) {

		/*
		 * 2행 (1행3열, 2행4열)
		 */
		int[][] arr = { { 1, 2, 3 }, { 1, 2, 3, 4 } };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println("\t" + arr[i].length);
		}
		
		System.out.println();
		
		/*
		 * 3행 4열
		 */
		int[][] arr1 = new int[3][4];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + ", ");
			}
			System.out.println("\t" + arr1[i].length);
		}

	}

}
