package class16;

public class InterviewQ7 {

	public static void main(String[] args) {
		// 7.Write a java program to check whether a given number is prime or not?
		/*
		 * prime number: is a number that has to meet 2 conditions: it should be be
		 * divisible by 1 and by itself ONLY 2, 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23
		 */
		// take range of numbers from 2 to 100 and print all prime
		// 2 , 3 (2,3), (2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)

		int num = 0;
		boolean isprime = true;
		if (num == 0 || num == 1) {
			isprime = false;
		} else {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			
		}
		if (isprime) {
			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is NOT a prime number");
		}
	}
}
