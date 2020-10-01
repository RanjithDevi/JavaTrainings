package Trainings;

public class SumOfDigitsInArray {
	public static void main(String[] args) {
		int[] a= {23,56,34,78,23};
		int s=a.length, sum=0;
		for (int i=0;i<s;i++)
		{
			sum=sum+a[i];
						
		}
		int avg = sum/s;
		System.out.println("Sum = " +sum);
		System.out.println("Average = " +avg);
	}

}
