package Trainings;

public class Stringlengthwithoutlen {
	public static void main(String[] args) {
		String text="abcdefghij";
		int s=0;
		char[] ch=text.toCharArray();
		System.out.print("Given String : \t ");
		for (char d : ch) {
				System.out.print(d);
				s=s+1;
	}
		System.out.println("\nString length : " +s);
}
}
