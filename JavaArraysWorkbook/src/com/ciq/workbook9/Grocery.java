	package com.ciq.workbook9;

import java.util.Scanner;

public class Grocery {

	public static void main(String[] args) {
		String[] sellCoffee = { "black coffee", "filter coffee", "bru coffee", "nestle coffee" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you sell coffee?\n");
		String input = scanner.nextLine();

		for (int i = 0; i < sellCoffee.length; i++) {

//			if (sellCoffee.equals("black coffee") || sellCoffee.equals("filter coffee")
//					|| sellCoffee.equals("bru coffee") || sellCoffee.equals("nestle coffee")) {
			if (sellCoffee[i].equals(input)) {
				System.out.println("\nwe have that coffee at postion  " + i);
				break;
			}

		}

	}

}
