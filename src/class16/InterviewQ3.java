package class16;

public class InterviewQ3 {

	public static void main(String[] args) {
		// 3.Find out how many alpha characters present in a string?
		String str="Hello6876868 *&^^, welcomegyggiugig!!!";
		str =str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str.length());

	}

}
