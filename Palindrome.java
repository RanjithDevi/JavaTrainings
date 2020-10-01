package Trainings;

public class Palindrome {

	public static void main(String[] args) {
		String str= "malayalam";
		StringBuffer sb= new StringBuffer(str);
		String reverse=sb.reverse().toString();
		System.out.println("Original String " +str);
		System.out.println("Reversed String " +reverse);
		if (str.equalsIgnoreCase(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		

	}

}
