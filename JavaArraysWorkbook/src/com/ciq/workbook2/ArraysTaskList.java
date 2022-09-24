package com.ciq.workbook2;

public class ArraysTaskList {
	
	public static void main(String[] args) {
		int arrays[]= {10,11,13,14,12, 15};
		int[] sortArray=arrays;
		for (int i = 0; i < sortArray.length; i++) {
			if(arrays[i]<sortArray[i]) {
			System.out.println(arrays[i]);
			}
		}
		
//		int [][] array2d= {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
//		
//		for (int[] is : array2d) {
//			for (int is2 :is) {
//				System.out.print(is2+",");
//			}
//			System.out.println();
//		}
		
		int [][] array2ds=new int[3][2];
		array2ds[0][0]=10;
		array2ds[0][1]=20;
		array2ds[1][0]=30;
		array2ds[1][1]=40;
		array2ds[2][0]=50;
		array2ds[2][1]=60;
		
		for (int[] is : array2ds) {
			for (int is2 :is) {
				System.out.print(is2+",");
			}
			System.out.println();
		}
	}

}
