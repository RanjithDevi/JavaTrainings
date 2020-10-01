package Trainings;

import java.util.Scanner;

public class ReverseNumberString {
	public static void main(String[] args) {
		/*String str="143";
		StringBuffer sb=new StringBuffer(str);
		String rev=sb.reverse().toString();
		System.out.println("Original Number  is " +str);
		System.out.println("Reversed Number is " +rev);*/
		
		/*Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to be reversed ");
		int num = sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Original Number  is " +num);
		System.out.println("Reversed Number is " +rev);*/
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to be reversed ");
		int num = sc.nextInt();
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		StringBuilder rev=sb.reverse();
		System.out.println("Original Number  is " +num);
		System.out.println("Reversed Number is " +rev);
	}

}
