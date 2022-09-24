package com.ciq.workbook9;
public class MultiDimentionalArrayDemo {

	public static void main(String[] args) {
		// 2d, 3d , 4d , 5d
		int[][] matrix = new int[3][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[2][0] = 5;
		matrix[2][1] = 6;

		int matrix2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		System.out.println(matrix2.length);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();

		}

		int[][] matrix3 = new int[3][3];
		matrix3[0][0] = 1;
		matrix3[0][1] = 2;
		matrix3[0][2] = 3;
		matrix3[1][0] = 4;
		matrix3[1][1] = 5;
		matrix3[1][2] = 6;
		matrix3[2][0] = 7;
		matrix3[2][1] = 8;
		matrix3[2][2] = 9;

		for (int[] i : matrix3) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
