package com.ciq.workbook9;
public class HighScore {

	public static int random() {
		double randomDouble = Math.random() * 5000;
		int randomInt = (int) randomDouble;
		return randomInt;
	}

	public static void main(String[] args) {
		int[] scores = { random(), random(), random(), random(), random(), random() };

		System.out.println("Here the scores:");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		int highScore = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > highScore) {
				highScore = scores[i];
			}
			System.out.println("\n\nThe highest score is: " + highScore + " . Give that man a cookie!");
		}
	}

}
