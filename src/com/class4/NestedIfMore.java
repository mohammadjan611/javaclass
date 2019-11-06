package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * check age, if age is less than 16--> you are too young to drive otherwise
		 * -->you are eligible to drive & we will check if you are older than 18--> you
		 * can get driver license and if not you can get learner permit
		 * 
		 */

		int age = 55; // Note:-- you can change th age Exaple 55 to 18 to 17.......
		if (age < 16) {
			System.out.println("you are too young to drive");
		} else {
			System.out.println("you are eligible to drive");
			if (age >= 18) {
				System.out.println("you can drive alone");
			} else {
				System.out.println("you need your parents to drive");
			}
		}
		System.out.println("---------------");

		/*
		 * we need to check if student completed the quiz if yes--> good jobe, if not
		 * --> not good if they completed we will check score: if more than 90--> you
		 * got an A if more than 80--> you got B anything below --> you should study
		 * more
		 */

		boolean quiz = false;
		int score = 89;

		if (quiz) {
			System.out.println("Good job !!!");

			if (score >= 90) {
				System.out.println("You got an A");
			} else if (score > 80) {
				System.out.println("You got a B");
			} else {
				System.out.println(" you should study more ");
			}

		} else {

		}

	}
}
