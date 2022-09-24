package com.ciq.workbook1;

import java.util.Scanner;

public class TicTackToe {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\nLet's Play a tic tac toe");
		// Task 1: Create an array with three rows of '_' character
		char[][] board = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };
		// Task 2: Call the function print Array

		printArray(board);

		// Task 3: Create a Loop for TURNS
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println("Turn: X");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'X';
				printArray(board);
			} else {
				System.out.println("Turn: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
				printArray(board);
			}
			if (checkWin(board) == 3) {
				System.out.println("X wins!!");
				break;
			} else if (checkWin(board) == -3) {
				System.out.println("O wins!!");
				break;
			} else if (i == 8) {
				System.out.println("It's a tie!");
			}
		}

		// Task 4: if(X){
//		 callaskUser()
//		populate the board using askUser's return value
//		else callaskUser

		// write a function that lets the user choose a spot
//		Inside the function
//		1. ask the user pick a row and column number
//		2. check if the spot is taken.If so, let the user choose again
//		3. return the row and column in an int[] array
	}

	public static void printArray(char[][] array) {
		System.out.print("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("\n\n");
		}

	}

	public static int[] askUser(char[][] board) {
		System.out.println(" .  Pick a row and column number: ");
		int row = scanner.nextInt();
		int element = scanner.nextInt();
//		return new int[] { 0, 1 };
		while (board[row][element] == 'X' || board[row][element] == 'O') {
			System.out.println("Spot taken, try again: ");
			row = scanner.nextInt();
			element = scanner.nextInt();

		}
		return new int[] { row, element };
	}

	public static int checkWin(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
				} else if (board[i][j] == 'O') {
					count--;
				}
			}
			if (count == 3 || count == -3) {
				return count;
			} else {
				count = 0;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (board[j][i] == 'X') {
					count++; // count each X as +1
				} else if (board[j][i] == 'O') {
					count--; // count each O as -1.
				}
			}
			if (count == 3 || count == -3) {
				return count;
			} else {
				count = 0;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (board[i][i] == 'X') {
				count++; // count each X as +1
			} else if (board[i][i] == 'O') {
				count--; // count each O as -1.
			}
		}

		if (count == 3 || count == -3) {
			return count;
		} else {
			count = 0;
		}

		for (int i = 0; i < 3; i++) {
			if (board[i][2 - i] == 'X') {
				count++; // count each X as +1
			} else if (board[i][2 - i] == 'O') {
				count--; // count each O as -1.
			}
		}
		return count;
	}
}
