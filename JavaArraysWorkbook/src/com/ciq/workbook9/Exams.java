package com.ciq.workbook9;
public class Exams {
	
//	 System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
     //Task 1: Create an array that stores 5 students: "Harry", "Neville", "Ron", "Hermione", "Seamus"

     //Task 2: Assign each student a seat according to their index in the array.
     //           print: " <student at index 0> ", you will take seat 0.
	
	public static void main(String[] args) {
		   String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
	        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
	        System.out.println(seats[0]+", you will take seat " + 0);
	        System.out.println(seats[1]+", you will take seat " + 1);
	        System.out.println(seats[2]+", you will take seat " + 2);
	        System.out.println(seats[3]+", you will take seat " + 3);
	        System.out.println(seats[4]+", you will take seat " + 4);
	}

}
