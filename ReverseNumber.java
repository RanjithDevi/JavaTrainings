package Trainings;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=123,rev=0;
		while(num!=0)
		{
			
		  rev=rev * 10;
		  rev=rev+(num % 10);
		  num=num/10;
		}
		  System.out.println(rev);
	}
	}
