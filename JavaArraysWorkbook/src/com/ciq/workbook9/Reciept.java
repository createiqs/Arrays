package com.ciq.workbook9;
public class Reciept {

	public static void main(String[] args) {
//		String[] fruits = { "mango", "apple", "bannana" };
//		double[] price = { 100.00, 240.00, 40.00 };
//		double[] tax = new double[price.length];
//		for (int i = 0; i < fruits.length; i++) {
//			tax[i] = price[i] * 1.10;
//			System.out.println("\t" + fruits[i] + " :INR " + Math.round(tax[i]) + " KG");
//		}
//
//	}
//
//}
		   // Task 2 - Populate your 2D array with values from the table (see article)
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };


        // Task 3 (Updated for Workbook 6.13 Revisit)- Print the prices for each department. Prices should share a single line.  
        for (int i = 0; i < prices.length; i++) {
            switch (i) {
                case 0: System.out.print("Baking: "); break;
                case 1: System.out.print("Beverage: "); break;
                case 2: System.out.print("Cereals: "); break;
            }
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + " ");
            }
            System.out.print("\n");
        }
    }}
