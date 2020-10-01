package Trainings;

public class ReverseString {
	public static void main(String[] args) {
		String str="Ranjith";
		int n=str.length();
		char[] ch= str.toCharArray();
		System.out.print("Reversed String is ");
		for (int i=n-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
}
}
