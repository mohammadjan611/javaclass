package class16;

public class InterviewQ4 {

	public static void main(String[] args) {
		/* 4.How to find out the par of the string from a string? What is substring?
		 *   Find number of words in string?
		 */
		String str="Today is very cold outside";
		String subString=str.substring(0, 5);
		System.out.println(subString);
		
		/*Step1: split based on the space --> array of String 
		 * Step2: find the length of an aray
		 */
		String[] words=str.split(" ");
		System.out.println(words.length);
	}

}
