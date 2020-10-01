package Trainings;

import java.util.Scanner;

public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits to fins the sum ");
		int num=sc.nextInt();
		int s=0;
		while(num>0)
		{
			num=num/10;
			s++;
		}
		System.out.println("Number of digits " +s);
			
		}
}